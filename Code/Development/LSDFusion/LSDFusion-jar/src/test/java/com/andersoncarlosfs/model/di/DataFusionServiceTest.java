/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersoncarlosfs.model.di;

import com.andersoncarlosfs.controller.services.DataFusionService;
import com.andersoncarlosfs.model.DataSource;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import org.apache.jena.rdf.model.RDFNode;
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
     * Test of getEquivalentClasses method, of class DataFusion.
     *
     * @throws java.io.IOException
     */
    @Test
    public void testGetEquivalentClasses() throws IOException {
        System.out.println("getEquivalentClasses");
        DataSource dataSource1 = new DataSource();
        dataSource1.setInputStream(new File("C:\\Users\\AndersonCarlos\\Desktop\\LSDFusion\\Datasets\\DBpedia\\links\\sample.ttl"));
        DataSource dataSource2 = new DataSource();
        dataSource2.setInputStream(new File("C:\\Users\\AndersonCarlos\\Desktop\\LSDFusion\\Datasets\\DBpedia\\links\\sample2.ttl"));
        DataFusionService service = new DataFusionService();
        Collection<Collection<RDFNode>> classes = service.getEquivalentClasses(dataSource1, dataSource2);
        for (Collection<RDFNode> classe : classes) {
            System.out.println("{");
            for (RDFNode node : classe) {
                System.out.println(node.toString());
            }
            System.out.println("}");
        }
    }

}
