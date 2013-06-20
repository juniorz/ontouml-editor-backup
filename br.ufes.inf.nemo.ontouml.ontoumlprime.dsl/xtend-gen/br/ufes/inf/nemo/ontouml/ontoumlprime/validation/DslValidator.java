/**
 * generated by Xtext
 */
package br.ufes.inf.nemo.ontouml.ontoumlprime.validation;

import br.ufes.inf.nemo.ontouml.PrimeOntoUML.PrimeOntoUMLPackage;
import br.ufes.inf.nemo.ontouml.ontoumlprime.validation.AbstractDslValidator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.examples.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.xtext.validation.EValidatorRegistrar;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class DslValidator extends AbstractDslValidator {
  @Override
  public void register(final EValidatorRegistrar registar) {
    super.register(registar);
    final PrimeOntoUMLPackage ePackage = PrimeOntoUMLPackage.eINSTANCE;
    final URI oclURI = URI.createPlatformPluginURI("/br.ufes.inf.nemo.ontouml.ontoumlprime/model/ontoumlprime.ocl", true);
    CompleteOCLEObjectValidator _completeOCLEObjectValidator = new CompleteOCLEObjectValidator(ePackage, oclURI);
    final CompleteOCLEObjectValidator validator = _completeOCLEObjectValidator;
    registar.register(ePackage, validator);
  }
}