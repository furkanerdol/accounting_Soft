/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounting.software;

/**
 *
 * @author Arif Dogru
 */
public interface Income {
    
        /**
     * Return to Incomes
     * @return 
     */
    Double getIncome();
    /**
     * Return to Income Name
     * @return 
     */
    String getName();
    /**
     * Return to Description
     * @return 
     */
    String getDescription();
}
