/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.managment.system;

import java.util.Date;

/**
 *
 * @author Abo El-Ata
 */
public class Task extends Object {
    private int projectId;
    private Date fromDate;
    private Date toDate;
    private String[] memberId;
    private String[] resourcesId;
    private String status;

    public Task(int id ,int projectId, String name, Date fromDate, Date toDate, String[] memberId, String[] resourcesId, String status) {
        this.projectId = projectId;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.memberId = memberId;
        this.resourcesId = resourcesId;
        this.status = status;
        super.setId(id);
        super.setName(name);
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String[] getMemberId() {
        return memberId;
    }

    public void setMemberId(String[] memberId) {
        this.memberId = memberId;
    }

    public String[] getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(String[] resourcesId) {
        this.resourcesId = resourcesId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
