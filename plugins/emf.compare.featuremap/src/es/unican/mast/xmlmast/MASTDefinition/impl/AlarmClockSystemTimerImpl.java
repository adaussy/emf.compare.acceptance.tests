/**
 * <copyright>
 * </copyright>
 *
 * $Id: AlarmClockSystemTimerImpl.java,v 1.1 2008/09/24 14:01:09 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition.impl;

import es.unican.mast.xmlmast.MASTDefinition.AlarmClockSystemTimer;
import es.unican.mast.xmlmast.MASTDefinition.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alarm Clock System Timer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.impl.AlarmClockSystemTimerImpl#getAvgOverhead <em>Avg Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.impl.AlarmClockSystemTimerImpl#getBestOverhead <em>Best Overhead</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.impl.AlarmClockSystemTimerImpl#getWorstOverhead <em>Worst Overhead</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlarmClockSystemTimerImpl extends EObjectImpl implements AlarmClockSystemTimer {
	/**
	 * The default value of the '{@link #getAvgOverhead() <em>Avg Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final float AVG_OVERHEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvgOverhead() <em>Avg Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgOverhead()
	 * @generated
	 * @ordered
	 */
	protected float avgOverhead = AVG_OVERHEAD_EDEFAULT;

	/**
	 * This is true if the Avg Overhead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean avgOverheadESet;

	/**
	 * The default value of the '{@link #getBestOverhead() <em>Best Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final float BEST_OVERHEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBestOverhead() <em>Best Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestOverhead()
	 * @generated
	 * @ordered
	 */
	protected float bestOverhead = BEST_OVERHEAD_EDEFAULT;

	/**
	 * This is true if the Best Overhead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bestOverheadESet;

	/**
	 * The default value of the '{@link #getWorstOverhead() <em>Worst Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstOverhead()
	 * @generated
	 * @ordered
	 */
	protected static final float WORST_OVERHEAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorstOverhead() <em>Worst Overhead</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstOverhead()
	 * @generated
	 * @ordered
	 */
	protected float worstOverhead = WORST_OVERHEAD_EDEFAULT;

	/**
	 * This is true if the Worst Overhead attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean worstOverheadESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlarmClockSystemTimerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ALARM_CLOCK_SYSTEM_TIMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvgOverhead() {
		return avgOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgOverhead(float newAvgOverhead) {
		float oldAvgOverhead = avgOverhead;
		avgOverhead = newAvgOverhead;
		boolean oldAvgOverheadESet = avgOverheadESet;
		avgOverheadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__AVG_OVERHEAD, oldAvgOverhead, avgOverhead, !oldAvgOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvgOverhead() {
		float oldAvgOverhead = avgOverhead;
		boolean oldAvgOverheadESet = avgOverheadESet;
		avgOverhead = AVG_OVERHEAD_EDEFAULT;
		avgOverheadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__AVG_OVERHEAD, oldAvgOverhead, AVG_OVERHEAD_EDEFAULT, oldAvgOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvgOverhead() {
		return avgOverheadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBestOverhead() {
		return bestOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBestOverhead(float newBestOverhead) {
		float oldBestOverhead = bestOverhead;
		bestOverhead = newBestOverhead;
		boolean oldBestOverheadESet = bestOverheadESet;
		bestOverheadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__BEST_OVERHEAD, oldBestOverhead, bestOverhead, !oldBestOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBestOverhead() {
		float oldBestOverhead = bestOverhead;
		boolean oldBestOverheadESet = bestOverheadESet;
		bestOverhead = BEST_OVERHEAD_EDEFAULT;
		bestOverheadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__BEST_OVERHEAD, oldBestOverhead, BEST_OVERHEAD_EDEFAULT, oldBestOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBestOverhead() {
		return bestOverheadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWorstOverhead() {
		return worstOverhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstOverhead(float newWorstOverhead) {
		float oldWorstOverhead = worstOverhead;
		worstOverhead = newWorstOverhead;
		boolean oldWorstOverheadESet = worstOverheadESet;
		worstOverheadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__WORST_OVERHEAD, oldWorstOverhead, worstOverhead, !oldWorstOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorstOverhead() {
		float oldWorstOverhead = worstOverhead;
		boolean oldWorstOverheadESet = worstOverheadESet;
		worstOverhead = WORST_OVERHEAD_EDEFAULT;
		worstOverheadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__WORST_OVERHEAD, oldWorstOverhead, WORST_OVERHEAD_EDEFAULT, oldWorstOverheadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorstOverhead() {
		return worstOverheadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__AVG_OVERHEAD:
				return new Float(getAvgOverhead());
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__BEST_OVERHEAD:
				return new Float(getBestOverhead());
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__WORST_OVERHEAD:
				return new Float(getWorstOverhead());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__AVG_OVERHEAD:
				setAvgOverhead(((Float)newValue).floatValue());
				return;
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__BEST_OVERHEAD:
				setBestOverhead(((Float)newValue).floatValue());
				return;
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__WORST_OVERHEAD:
				setWorstOverhead(((Float)newValue).floatValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__AVG_OVERHEAD:
				unsetAvgOverhead();
				return;
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__BEST_OVERHEAD:
				unsetBestOverhead();
				return;
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__WORST_OVERHEAD:
				unsetWorstOverhead();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__AVG_OVERHEAD:
				return isSetAvgOverhead();
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__BEST_OVERHEAD:
				return isSetBestOverhead();
			case ModelPackage.ALARM_CLOCK_SYSTEM_TIMER__WORST_OVERHEAD:
				return isSetWorstOverhead();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (avgOverhead: ");
		if (avgOverheadESet) result.append(avgOverhead); else result.append("<unset>");
		result.append(", bestOverhead: ");
		if (bestOverheadESet) result.append(bestOverhead); else result.append("<unset>");
		result.append(", worstOverhead: ");
		if (worstOverheadESet) result.append(worstOverhead); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AlarmClockSystemTimerImpl
