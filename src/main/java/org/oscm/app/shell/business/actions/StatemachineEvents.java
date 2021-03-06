/*******************************************************************************
 *                                                                              
 *  Copyright FUJITSU LIMITED 2018                                           
 *                                                                                                                                 
 *  Creation Date: Aug 2, 2017                                                      
 *                                                                              
 *******************************************************************************/
package org.oscm.app.shell.business.actions;

public interface StatemachineEvents {

    String FINISHED = "finished";
    String SUCCESS = "success";
    String END = "end";
    String ERROR = "error";
    String FAILED = "failed";
    String EXECUTING = "executing";
    String RUN = "run";
}
