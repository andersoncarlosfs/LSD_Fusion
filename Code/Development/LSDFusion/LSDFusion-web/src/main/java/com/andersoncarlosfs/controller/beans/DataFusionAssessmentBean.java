/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersoncarlosfs.controller.beans;

import com.andersoncarlosfs.annotations.scopes.ApplicationScope;
import com.andersoncarlosfs.data.model.assessments.DataFusionAssessment;

/**
 *
 * @author Anderson Carlos Ferreira da Silva
 */
@ApplicationScope
public class DataFusionAssessmentBean {
 
    private DataFusionAssessment assessment;

    public DataFusionAssessmentBean() {
    }

    /**
     * 
     * @return the assessment
     */
    public DataFusionAssessment getAssessment() {
        return assessment;
    }

    /**
     * 
     * @param assessment the assessment to set
     */
    public void setAssessment(DataFusionAssessment assessment) {
        this.assessment = assessment;
    }
    
    /**
     *
     * @return
     */
    public void reset() {

        assessment = null;

    }
    
}
