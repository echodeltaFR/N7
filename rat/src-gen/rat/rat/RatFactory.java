/**
 * generated by Xtext 2.12.0
 */
package rat.rat;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rat.rat.RatPackage
 * @generated
 */
public interface RatFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RatFactory eINSTANCE = rat.rat.impl.RatFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Prog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prog</em>'.
   * @generated
   */
  Prog createProg();

  /**
   * Returns a new object of class '<em>Fun</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fun</em>'.
   * @generated
   */
  Fun createFun();

  /**
   * Returns a new object of class '<em>Bloc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bloc</em>'.
   * @generated
   */
  Bloc createBloc();

  /**
   * Returns a new object of class '<em>I</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>I</em>'.
   * @generated
   */
  I createI();

  /**
   * Returns a new object of class '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declaration</em>'.
   * @generated
   */
  Declaration createDeclaration();

  /**
   * Returns a new object of class '<em>Affectation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Affectation</em>'.
   * @generated
   */
  Affectation createAffectation();

  /**
   * Returns a new object of class '<em>Constante</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constante</em>'.
   * @generated
   */
  Constante createConstante();

  /**
   * Returns a new object of class '<em>Print</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Print</em>'.
   * @generated
   */
  Print createPrint();

  /**
   * Returns a new object of class '<em>Conditionnelle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditionnelle</em>'.
   * @generated
   */
  Conditionnelle createConditionnelle();

  /**
   * Returns a new object of class '<em>Tantque</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tantque</em>'.
   * @generated
   */
  Tantque createTantque();

  /**
   * Returns a new object of class '<em>DP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DP</em>'.
   * @generated
   */
  DP createDP();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>CP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CP</em>'.
   * @generated
   */
  CP createCP();

  /**
   * Returns a new object of class '<em>E</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>E</em>'.
   * @generated
   */
  E createE();

  /**
   * Returns a new object of class '<em>Appel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Appel</em>'.
   * @generated
   */
  Appel createAppel();

  /**
   * Returns a new object of class '<em>Rationnel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rationnel</em>'.
   * @generated
   */
  Rationnel createRationnel();

  /**
   * Returns a new object of class '<em>Numerateur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numerateur</em>'.
   * @generated
   */
  Numerateur createNumerateur();

  /**
   * Returns a new object of class '<em>Denominateur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Denominateur</em>'.
   * @generated
   */
  Denominateur createDenominateur();

  /**
   * Returns a new object of class '<em>Identificateur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identificateur</em>'.
   * @generated
   */
  Identificateur createIdentificateur();

  /**
   * Returns a new object of class '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean</em>'.
   * @generated
   */
  Boolean createBoolean();

  /**
   * Returns a new object of class '<em>Entier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entier</em>'.
   * @generated
   */
  Entier createEntier();

  /**
   * Returns a new object of class '<em>Op Bin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op Bin</em>'.
   * @generated
   */
  OpBin createOpBin();

  /**
   * Returns a new object of class '<em>Operande</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operande</em>'.
   * @generated
   */
  Operande createOperande();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RatPackage getRatPackage();

} //RatFactory
