/**
 * <copyright>
 * </copyright>
 *
 * $Id: HardLocalDeadline.java,v 1.1 2008/09/24 14:01:08 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hard Local Deadline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.HardLocalDeadline#getDeadline <em>Deadline</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getHardLocalDeadline()
 * @model extendedMetaData="name='Hard_Local_Deadline' kind='empty'"
 * @generated
 */
public interface HardLocalDeadline extends EObject {
	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #setDeadline(float)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getHardLocalDeadline_Deadline()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.MASTDefinition.Time"
	 *        extendedMetaData="kind='attribute' name='Deadline'"
	 * @generated
	 */
	float getDeadline();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.HardLocalDeadline#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.HardLocalDeadline#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(float)
	 * @generated
	 */
	void unsetDeadline();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.HardLocalDeadline#getDeadline <em>Deadline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadline</em>' attribute is set.
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(float)
	 * @generated
	 */
	boolean isSetDeadline();

} // HardLocalDeadline
