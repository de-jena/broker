/*
 */
package de.jena.sensinact.sthbnd.rest.tlc.control.model.control;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcControlFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
public interface TlcControlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "control";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://jena.de/models/tlc/control/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tlcControl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TlcControlPackage eINSTANCE = de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcControlPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcImpl <em>Tlc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcImpl
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getTlc()
	 * @generated
	 */
	int TLC = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC__LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Tlc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tlc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.LocationImpl
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.ModeImpl
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__CODE = 3;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.ControlImpl
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MODE = 0;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.IdsListReponseImpl <em>Ids List Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.IdsListReponseImpl
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getIdsListReponse()
	 * @generated
	 */
	int IDS_LIST_REPONSE = 4;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDS_LIST_REPONSE__IDS = 0;

	/**
	 * The number of structural features of the '<em>Ids List Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDS_LIST_REPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ids List Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDS_LIST_REPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.ModesListReponseImpl <em>Modes List Reponse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.ModesListReponseImpl
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getModesListReponse()
	 * @generated
	 */
	int MODES_LIST_REPONSE = 5;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODES_LIST_REPONSE__MODES = 0;

	/**
	 * The number of structural features of the '<em>Modes List Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODES_LIST_REPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Modes List Reponse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODES_LIST_REPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcHolderImpl <em>Tlc Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcHolderImpl
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.impl.TlcControlPackageImpl#getTlcHolder()
	 * @generated
	 */
	int TLC_HOLDER = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Tlc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER__TLC = 1;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER__MODES = 2;

	/**
	 * The feature id for the '<em><b>Current Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER__CURRENT_CONTROL = 3;

	/**
	 * The number of structural features of the '<em>Tlc Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tlc Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLC_HOLDER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc <em>Tlc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tlc</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc
	 * @generated
	 */
	EClass getTlc();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc#getId()
	 * @see #getTlc()
	 * @generated
	 */
	EAttribute getTlc_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc#getName()
	 * @see #getTlc()
	 * @generated
	 */
	EAttribute getTlc_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc#getDescription()
	 * @see #getTlc()
	 * @generated
	 */
	EAttribute getTlc_Description();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Tlc#getLocation()
	 * @see #getTlc()
	 * @generated
	 */
	EReference getTlc_Location();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getId()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getName()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getDescription()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Mode#getCode()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Code();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.Control#getMode()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Mode();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.IdsListReponse <em>Ids List Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ids List Reponse</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.IdsListReponse
	 * @generated
	 */
	EClass getIdsListReponse();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.IdsListReponse#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.IdsListReponse#getIds()
	 * @see #getIdsListReponse()
	 * @generated
	 */
	EAttribute getIdsListReponse_Ids();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.ModesListReponse <em>Modes List Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modes List Reponse</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.ModesListReponse
	 * @generated
	 */
	EClass getModesListReponse();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.ModesListReponse#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.ModesListReponse#getModes()
	 * @see #getModesListReponse()
	 * @generated
	 */
	EReference getModesListReponse_Modes();

	/**
	 * Returns the meta object for class '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder <em>Tlc Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tlc Holder</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder
	 * @generated
	 */
	EClass getTlcHolder();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder#getId()
	 * @see #getTlcHolder()
	 * @generated
	 */
	EAttribute getTlcHolder_Id();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder#getTlc <em>Tlc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tlc</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder#getTlc()
	 * @see #getTlcHolder()
	 * @generated
	 */
	EReference getTlcHolder_Tlc();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder#getModes()
	 * @see #getTlcHolder()
	 * @generated
	 */
	EReference getTlcHolder_Modes();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder#getCurrentControl <em>Current Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Control</em>'.
	 * @see de.jena.sensinact.sthbnd.rest.tlc.control.model.control.TlcHolder#getCurrentControl()
	 * @see #getTlcHolder()
	 * @generated
	 */
	EReference getTlcHolder_CurrentControl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TlcControlFactory getTlcControlFactory();

} //TlcControlPackage
