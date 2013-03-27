/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Felipe Bill
 */
public class CPFValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String cpf = (String) value;     
            throw new ValidatorException(new FacesMessage("CPF \'" + cpf + "\' em formato incorreto."));
       
    }
    
}
