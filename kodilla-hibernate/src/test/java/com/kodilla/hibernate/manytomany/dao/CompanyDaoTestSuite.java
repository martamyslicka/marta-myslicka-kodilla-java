package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;


    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {

        }
    }

    @Test
    void testNamedQueries() {
        //given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieKovalsky = new Employee("Stephanie", "Kovalsky");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        employeeDao.save(johnSmith);
        int jSID = johnSmith.getId();
        employeeDao.save(stephanieKovalsky);
        int sKID = stephanieKovalsky.getId();
        employeeDao.save(lindaKovalsky);
        int lKID = lindaKovalsky.getId();

        companyDao.save(softwareMachine);
        int sMID = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dMID = dataMaesters.getId();
        companyDao.save(greyMatter);
        int gMID = greyMatter.getId();

        //when
        List<Employee> howManyKovalsky = employeeDao.retrieveEmployeesByLastnames("Kovalsky");
        List<Company> companiesStartsWithDat = companyDao.findCompaniesWith3Char("Dat");

        //then
        try {

            assertEquals(3, howManyKovalsky.size());
            assertEquals(2, companiesStartsWithDat.size());

        } finally {
            companyDao.deleteById(sMID);
            companyDao.deleteById(dMID);
            companyDao.deleteById(gMID);
            employeeDao.deleteById(jSID);
            employeeDao.deleteById(sKID);
            employeeDao.deleteById(lKID);

        }


    }
}