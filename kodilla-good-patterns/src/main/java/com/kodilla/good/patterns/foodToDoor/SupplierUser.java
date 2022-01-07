package com.kodilla.good.patterns.foodToDoor;

public class SupplierUser {
   private String supplierName;
   private String supplierMail;
   private String supplierPhone;
   private String nip;

    public SupplierUser(String supplierName, String supplierMail, String supplierPhone, String nip) {
        this.supplierName = supplierName;
        this.supplierMail = supplierMail;
        this.supplierPhone = supplierPhone;
        this.nip = nip;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierMail() {
        return supplierMail;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return "SupplierUser{" +
                "supplierName='" + supplierName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupplierUser)) return false;

        SupplierUser that = (SupplierUser) o;

        return getSupplierName().equals(that.getSupplierName());
    }

    @Override
    public int hashCode() {
        return getSupplierName().hashCode();
    }
}
