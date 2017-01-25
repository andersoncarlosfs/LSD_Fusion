/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersoncarlosfs.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import org.apache.jena.rdf.model.RDFNode;

/**
 *
 * @author Anderson Carlos Ferreira da Silva
 */
public class DataCluster extends HashSet<RDFNode> {

    public DataCluster() {
        super();
    }

    public DataCluster(Collection<? extends RDFNode> instances) {
        super(instances);
    }

    public DataCluster(RDFNode... instances) {
        super(Arrays.asList(instances));
    }

}
