/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersoncarlosfs.controller.services;

import com.andersoncarlosfs.model.DataSource;
import com.andersoncarlosfs.model.di.QuotientSet;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.riot.Lang;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author lsdfusion
 */
public class DataFusionServiceTest {

    public DataFusionServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getEquivalenceClasses method, of class DataFusion.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testGetEquivalenceClasses() throws IOException {
        System.out.println("begin test getEquivalentClasses");
        //https://www.w3.org/wiki/DataSetRDFDumps
        //http://data.bnf.fr/semanticweb
        DataSource dataSource = new DataSource();
        //dataSource.setInputStream(new File("../../../../Datasets/BNF/dataset.tar.gz"));
        dataSource.setInputStream(new File("../../../../Datasets/INA/dataset.ttl"));
        dataSource.setSyntax(Lang.TURTLE);
        DataSource link = new DataSource();
        //link.setInputStream(new File("../../../../Datasets/BNF/links.nt"));
        link.setInputStream(new File("../../../../Datasets/INA/links.n3"));
        //link.setSyntax(Lang.NT);       
        link.setSyntax(Lang.N3);
        DataFusionService service = new DataFusionService();
        Integer size = 0;
        QuotientSet equivalenceClasses = service.findEquivalenceClasses(Arrays.asList(dataSource), link);
        for (Collection<RDFNode> classe : equivalenceClasses.asCollection()) {
            size += classe.size();
            System.out.println("{");
            for (RDFNode node : classe) {
                System.out.println(node.toString());
                System.out.println(" - p - " + equivalenceClasses.tree.get(node).parent);
            }
            System.out.println("}");
        }
        //System.out.println("Total of equivalence classes: " + equivalenceClasses.size());
        System.out.println("end test getEquivalentClasses");
    }

}
