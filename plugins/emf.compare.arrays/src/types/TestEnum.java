/**
 */
package types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Test Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see types.TypesPackage#getTestEnum()
 * @model
 * @generated
 */
public enum TestEnum implements Enumerator {
	/**
	 * The '<em><b>Enum0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM0_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM0(0, "Enum0", "Enum0"),

	/**
	 * The '<em><b>Enum1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM1_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM1(1, "Enum1", "Enum1"),

	/**
	 * The '<em><b>Enum2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM2_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM2(2, "Enum2", "Enum2");

	/**
	 * The '<em><b>Enum0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM0
	 * @model name="Enum0"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM0_VALUE = 0;

	/**
	 * The '<em><b>Enum1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM1
	 * @model name="Enum1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM1_VALUE = 1;

	/**
	 * The '<em><b>Enum2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM2
	 * @model name="Enum2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Test Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TestEnum[] VALUES_ARRAY =
		new TestEnum[] {
			ENUM0,
			ENUM1,
			ENUM2,
		};

	/**
	 * A public read-only list of all the '<em><b>Test Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TestEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Test Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestEnum get(int value) {
		switch (value) {
			case ENUM0_VALUE: return ENUM0;
			case ENUM1_VALUE: return ENUM1;
			case ENUM2_VALUE: return ENUM2;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TestEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TestEnum
