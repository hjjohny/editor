//======================================================================
//
// File: EnumerationS_EDTPropertySource.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/BuildPropertySource.arc
// Version:      $Revision: 1.66 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

package com.mentor.nucleus.bp.ui.properties;
import org.eclipse.ui.views.properties.*;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import com.mentor.nucleus.bp.core.ui.cells.editors.*;
import com.mentor.nucleus.bp.core.util.DimensionsUtil;

public class EnumerationS_EDTPropertySource implements IPropertySource {
	private EnumerationDataType_c m_inst;
	private DataType_c[] m_DataType;
	private Enumerator_c[] m_Enumerator;
	private PropertyDescriptor[] m_propertyDescriptors;

	MetadataSortingManager sorter = MetadataSortingManager.createDefault();

	public EnumerationS_EDTPropertySource(EnumerationDataType_c inst) {
		m_inst = inst;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	public Object getEditableValue() {
		return this;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object id) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object id) {
		// do nothing
	}

	public String toString() {
		return m_inst.Get_name();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (m_inst == null || m_inst.isOrphaned())
			return new IPropertyDescriptor[0];
		int num_children = 0;
		DataType_c[] v_datatype = DataType_c
				.getManyS_DTsOnR17((EnumerationDataType_c) m_inst);

		m_DataType = v_datatype;
		num_children += m_DataType.length;

		sorter.sort(v_datatype);
		Enumerator_c[] v_enumerator = Enumerator_c
				.getManyS_ENUMsOnR27((EnumerationDataType_c) m_inst);

		m_Enumerator = v_enumerator;
		num_children += m_Enumerator.length;

		sorter.sort(v_enumerator);
		if (m_propertyDescriptors == null
				|| 0 + num_children != m_propertyDescriptors.length) {
			m_propertyDescriptors = new PropertyDescriptor[0 + num_children];
			boolean readonly = false;

			int d_index = 0;
			for (int i = 0; i < m_DataType.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"DataType." + String.valueOf(i), "Data Type");
				m_propertyDescriptors[d_index].setCategory("Data Type");
				++d_index;
			}

			for (int i = 0; i < m_Enumerator.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"Enumerator." + String.valueOf(i), "Enumerator");
				m_propertyDescriptors[d_index].setCategory("Enumerator");
				++d_index;
			}

		}
		return m_propertyDescriptors;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		if (m_inst.isOrphaned()) {
			return "";
		}
		int d_index = 0;
		for (int i = 0; i < m_DataType.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new DataTypeS_DTPropertySource(m_DataType[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_Enumerator.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new EnumeratorS_ENUMPropertySource(m_Enumerator[i]);
			}
			++d_index;
		}

		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
	}
}
