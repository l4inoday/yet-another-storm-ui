package com.deepnighttwo.yasu.model;

/**
 * User: mzang
 * Date: 2014-09-29
 * Time: 18:41
 */
public class Topology {
    String id;
    String name;
    String status;
    String uptime;
    int tasksTotal;
    int workersTotal;
    int executorsTotal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public int getTasksTotal() {
        return tasksTotal;
    }

    public void setTasksTotal(int tasksTotal) {
        this.tasksTotal = tasksTotal;
    }

    public int getWorkersTotal() {
        return workersTotal;
    }

    public void setWorkersTotal(int workersTotal) {
        this.workersTotal = workersTotal;
    }

    public int getExecutorsTotal() {
        return executorsTotal;
    }

    public void setExecutorsTotal(int executorsTotal) {
        this.executorsTotal = executorsTotal;
    }
}
