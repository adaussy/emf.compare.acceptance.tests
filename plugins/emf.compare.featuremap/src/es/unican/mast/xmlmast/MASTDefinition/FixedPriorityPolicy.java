/**
 * <copyright>
 * </copyright>
 *
 * $Id: FixedPriorityPolicy.java,v 1.1 2008/09/24 14:01:08 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Priority Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.FixedPriorityPolicy#getPreassigned <em>Preassigned</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.FixedPriorityPolicy#getThePriority <em>The Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getFixedPriorityPolicy()
 * @model extendedMetaData="name='Fixed_Priority_Policy' kind='empty'"
 * @generated
 */
public interface FixedPriorityPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Preassigned</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.MASTDefinition.Assertion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preassigned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preassigned</em>' attribute.
	 * @see es.unican.mast.xmlmast.MASTDefinition.Assertion
	 * @see #isSetPreassigned()
	 * @see #unsetPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getFixedPriorityPolicy_Preassigned()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Preassigned'"
	 * @generated
	 */
	Assertion getPreassigned();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.FixedPriorityPolicy#getPreassigned <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preassigned</em>' attribute.
	 * @see es.unican.mast.xmlmast.MASTDefinition.Assertion
	 * @see #isSetPreassigned()
	 * @see #unsetPreassigned()
	 * @see #getPreassigned()
	 * @generated
	 */
	void setPreassigned(Assertion value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.FixedPriorityPolicy#getPreassigned <em>Preassigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @generated
	 */
	void unsetPreassigned();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.FixedPriorityPolicy#getPreassigned <em>Preassigned</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preassigned</em>' attribute is set.
	 * @see #unsetPreassigned()
	 * @see #getPreassigned()
	 * @see #setPreassigned(Assertion)
	 * @generated
	 */
	boolean isSetPreassigned();

	/**
	 * Returns the value of the '<em><b>The Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Priority</em>' attribute.
	 * @see #setThePriority(BigInteger)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getFixedPriorityPolicy_ThePriority()
	 * @model dataType="es.unican.mast.xmlmast.MASTDefinition.Priority"
	 *        extendedMetaData="kind='attribute' name='The_Priority'"
	 * @generated
	 */
	BigInteger getThePriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.FixedPriorityPolicy#getThePriority <em>The Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Priority</em>' attribute.
	 * @see #getThePriority()
	 * @generated
	 */
	void setThePriority(BigInteger value);

} // FixedPriorityPolicy
