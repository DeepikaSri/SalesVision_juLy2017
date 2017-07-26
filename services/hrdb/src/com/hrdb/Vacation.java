/*Copyright (c) 2015-2016 wavemaker-com All Rights Reserved.This software is the confidential and proprietary information of wavemaker-com You shall not disclose such Confidential Information and shall use it only in accordance with the terms of the source code license agreement you entered into with wavemaker-com*/
package com.hrdb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Vacation generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`VACATION`")
public class Vacation implements Serializable {

    private Integer id;
    private Date startdate;
    private Date enddate;
    private int empid;
    private Integer tenantid;
    private Employee employee;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`STARTDATE`", nullable = true)
    public Date getStartdate() {
        return this.startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    @Column(name = "`ENDDATE`", nullable = true)
    public Date getEnddate() {
        return this.enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Column(name = "`EMPID`", nullable = false, scale = 0, precision = 10)
    public int getEmpid() {
        return this.empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    @Column(name = "`TENANTID`", nullable = true, scale = 0, precision = 10)
    public Integer getTenantid() {
        return this.tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`EMPID`", referencedColumnName = "`EID`", insertable = false, updatable = false)
    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        if(employee != null) {
            this.empid = employee.getEid();
        }

        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vacation)) return false;
        final Vacation vacation = (Vacation) o;
        return Objects.equals(getId(), vacation.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

