/**
 * <copyright>
 * </copyright>
 *
 * $Id: OverriddenFixedPriority.java,v 1.1 2008/09/24 14:01:08 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overridden Fixed Priority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.OverriddenFixedPriority#getThePriority <em>The Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getOverriddenFixedPriority()
 * @model extendedMetaData="name='Overridden_Fixed_Priority' kind='empty'"
 * @generated
 */
public interface OverriddenFixedPriority extends EObject {
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
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getOverriddenFixedPriority_ThePriority()
	 * @model dataType="es.unican.mast.xmlmast.MASTDefinition.Priority" required="true"
	 *        extendedMetaData="kind='attribute' name='The_Priority'"
	 * @generated
	 */
	BigInteger getThePriority();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.OverriddenFixedPriority#getThePriority <em>The Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Priority</em>' attribute.
	 * @see #getThePriority()
	 * @generated
	 */
	void setThePriority(BigInteger value);

} // OverriddenFixedPriority
