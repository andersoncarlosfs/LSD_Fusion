package com.andersoncarlosfs.controller.beans;

import com.andersoncarlosfs.annotations.scopes.ApplicationScope;
import com.andersoncarlosfs.data.model.DataSource;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Anderson Carlos Ferreira da Silva
 */
@ApplicationScope
public class DataFusionBean {

    private Collection<DataSource> dataSources;

    private DataSource selected;

    private String property;

    public DataFusionBean() {
    }

    /**
     *
     * @return the dataSources
     */
    public Collection<DataSource> getDataSources() {
        return dataSources;
    }

    /**
     *
     * @param dataSources the dataSources to set
     */
    public void setDataSources(Collection<DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    /**
     *
     * @return the selected
     */
    public DataSource getSelected() {
        return selected;
    }

    /**
     *
     * @param selected the selected to set
     */
    public void setSelected(DataSource selected) {
        this.selected = selected;
    }

    /**
     *
     */
    public void newDataFusion() {
        dataSources = new HashSet();
    }

    /**
     *
     */
    public void newDataSource() {
        selected = new DataSource();
    }

    /**
     *
     */
    public void newProperty() {
        property = new String();
    }

    /**
     *
     */
    public void removeDataSource() {
        dataSources.remove(selected);
    }

    /**
     *
     */
    public void fuseDataSources() {

    }

}
