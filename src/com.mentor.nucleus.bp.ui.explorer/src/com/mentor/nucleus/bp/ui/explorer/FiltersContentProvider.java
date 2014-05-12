package com.mentor.nucleus.bp.ui.explorer;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/FiltersContentProvider.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_filters_content_provider.inc
// Version:      $Revision: 1.11 $
//
// (c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.
//
//======================================================================
//
// This class provides the Model Explorer filter dialog with a list of
// things that can be filtered.
//
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * The FiltersContentProvider provides the elements for use by the list dialog
 * for selecting the patterns to apply.
 */
class FiltersContentProvider implements IStructuredContentProvider {
	private static List definedFilters;
	/**
	 * Create a FiltersContentProvider using the selections from the supplied
	 * resource filter.
	 */
	public FiltersContentProvider() {
	}
	/* (non-Javadoc)
	 * Method declared on IContentProvider.
	 */
	public void dispose() {
	}
	/**
	 * Returns the filters currently defined for the navigator.
	 *
	 * @return a list of strings
	 */
	public static List getDefinedFilters() {
		if (definedFilters == null) {
			readFilters();
		}
		return definedFilters;
	}
	/* (non-Javadoc)
	 * Method declared on IStructuredContentProvider.
	 */
	public Object[] getElements(Object inputElement) {
		return getDefinedFilters().toArray();
	}
	/**
	 * Return the initially selected elements.
	 */
	public String[] getInitialSelections() {
		IDialogSettings settings = ExplorerPlugin.getDefault()
				.getDialogSettings();
		ArrayList selections = new ArrayList();
		if (settings != null) {
			IDialogSettings filterSect = settings
					.getSection("com.mentor.nucleus.bp.ui.filterSettings"); // $NON-NLS-1$
			if (filterSect != null) {
				for (int i = 0; i < getDefinedFilters().size(); i++) {
					String filter = filterSect.get((String) getDefinedFilters()
							.get(i));
					if (filter != null) {
						if (filter.equals("true")) { // $NON-NLS-1$
							selections.add(getDefinedFilters().get(i));
						}
					}
				}
			}
		}
		String[] result = new String[selections.size()];
		for (int i = 0; i < selections.size(); i++) {
			result[i] = (String) selections.get(i);
		}
		return result;
	}
	/**
	 * Set the selected elements
	 */
	public void setSelections(String[] elements) {
		ArrayList selections = new ArrayList();
		for (int i = 0; i < elements.length; i++) {
			selections.add(elements[i]);
		}
		IDialogSettings settings = ExplorerPlugin.getDefault()
				.getDialogSettings();
		if (settings != null) {
			IDialogSettings filterSect = settings
					.getSection("com.mentor.nucleus.bp.ui.filterSettings"); // $NON-NLS-1$
			if (filterSect == null) {
				filterSect = settings
						.addNewSection("com.mentor.nucleus.bp.ui.filterSettings"); // $NON-NLS-1$
			}
			filterSect.put("System", selections.contains("System")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Domains", selections.contains("Domains")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Subsystems", selections.contains("Subsystems")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Classes", selections.contains("Classes")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Attributes", selections.contains("Attributes")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Operations", selections.contains("Operations")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Operation Parameters",
					selections.contains("Operation Parameters")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Instance State Machines",
					selections.contains("Instance State Machines")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("States", selections.contains("States")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Events", selections.contains("Events")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Inherited Events",
					selections.contains("Inherited Events")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Delivered Events",
					selections.contains("Delivered Events")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("State Machine Event Data Items",
					selections.contains("State Machine Event Data Items")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Class State Machines",
					selections.contains("Class State Machines")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Function Packages",
					selections.contains("Function Packages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Functions", selections.contains("Functions")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Function Parameters",
					selections.contains("Function Parameters")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Data Type Packages",
					selections.contains("Data Type Packages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("External Entity Packages",
					selections.contains("External Entity Packages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("User Defined Data Types",
					selections.contains("User Defined Data Types")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("External Entities",
					selections.contains("External Entities")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Bridge Operations",
					selections.contains("Bridge Operations")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Bridge Parameters",
					selections.contains("Bridge Parameters")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Enumerations", selections.contains("Enumerations")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Enumerators", selections.contains("Enumerators")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Core Data Types",
					selections.contains("Core Data Types")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Event Data Items",
					selections.contains("Event Data Items")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Sequences", selections.contains("Sequences")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Instances", selections.contains("Instances")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Informal Instance Attributes",
					selections.contains("Informal Instance Attributes")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Informal Message Arguments",
					selections.contains("Informal Message Arguments")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Event Message Arguments",
					selections.contains("Event Message Arguments")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Function Message Arguments",
					selections.contains("Function Message Arguments")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Class Message Arguments",
					selections.contains("Class Message Arguments")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Bridge Message Arguments",
					selections.contains("Bridge Message Arguments")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Imported Classes",
					selections.contains("Imported Classes")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Imported External Entities",
					selections.contains("Imported External Entities")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Imported Function Packages",
					selections.contains("Imported Function Packages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Imported Packages",
					selections.contains("Imported Packages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Informal Class Attributes",
					selections.contains("Informal Class Attributes")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Formal Instance Attributes",
					selections.contains("Formal Instance Attributes")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Actors", selections.contains("Actors")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Incoming Synchronous Messages",
					selections.contains("Incoming Synchronous Messages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Incoming Asynchronous Messages",
					selections.contains("Incoming Asynchronous Messages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Incoming Return Messages",
					selections.contains("Incoming Return Messages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Communications",
					selections.contains("Communications")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Use Case Diagrams",
					selections.contains("Use Case Diagrams")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Use Cases", selections.contains("Use Cases")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Activities", selections.contains("Activities")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Actions", selections.contains("Actions")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("ObjectNodes", selections.contains("ObjectNodes")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Accept Event Actions",
					selections.contains("Accept Event Actions")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Send Signal Actions",
					selections.contains("Send Signal Actions")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Accept Time Event Actions",
					selections.contains("Accept Time Event Actions")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Interface Packages",
					selections.contains("Interface Packages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Interfaces", selections.contains("Interfaces")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Signals", selections.contains("Signals")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Parameters", selections.contains("Parameters")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Component Packages",
					selections.contains("Component Packages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Components", selections.contains("Components")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Provided Interfaces",
					selections.contains("Provided Interfaces")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Required Interfaces",
					selections.contains("Required Interfaces")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Required Interface Operations",
					selections.contains("Required Interface Operations")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Provided Interface Operations",
					selections.contains("Provided Interface Operations")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Required Interface Signals",
					selections.contains("Required Interface Signals")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Provided Interface Signals",
					selections.contains("Provided Interface Signals")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Interface Operations",
					selections.contains("Interface Operations")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Component References",
					selections.contains("Component References")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Structured Data Types",
					selections.contains("Structured Data Types")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Members", selections.contains("Members")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Ports", selections.contains("Ports")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Imported Provided Interfaces",
					selections.contains("Imported Provided Interfaces")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Imported Required Interfaces",
					selections.contains("Imported Required Interfaces")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Component Participants",
					selections.contains("Component Participants")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Packages", selections.contains("Packages")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Constant Specifications",
					selections.contains("Constant Specifications")); // $NON-NLS-1$ $NON-NLS-2$
			filterSect.put("Literal Symbolic Constants",
					selections.contains("Literal Symbolic Constants")); // $NON-NLS-1$ $NON-NLS-2$
		}
	}
	/* (non-Javadoc)
	 * Method declared on IContentProvider.
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Input cannot change, do nothing.
	}
	/**
	 * Reads the filters currently defined for the workbench. 
	 */
	private static void readFilters() {
		definedFilters = new ArrayList();
		definedFilters.add("Domains"); // $NON-NLS-1$
		definedFilters.add("Subsystems"); // $NON-NLS-1$
		definedFilters.add("Classes"); // $NON-NLS-1$
		definedFilters.add("Attributes"); // $NON-NLS-1$
		definedFilters.add("Operations"); // $NON-NLS-1$
		definedFilters.add("Operation Parameters"); // $NON-NLS-1$
		definedFilters.add("Instance State Machines"); // $NON-NLS-1$
		definedFilters.add("States"); // $NON-NLS-1$
		definedFilters.add("Events"); // $NON-NLS-1$
		definedFilters.add("Inherited Events"); // $NON-NLS-1$
		definedFilters.add("Delivered Events"); // $NON-NLS-1$
		definedFilters.add("State Machine Event Data Items"); // $NON-NLS-1$
		definedFilters.add("Class State Machines"); // $NON-NLS-1$
		definedFilters.add("Function Packages"); // $NON-NLS-1$
		definedFilters.add("Functions"); // $NON-NLS-1$
		definedFilters.add("Function Parameters"); // $NON-NLS-1$
		definedFilters.add("Data Type Packages"); // $NON-NLS-1$
		definedFilters.add("External Entity Packages"); // $NON-NLS-1$
		definedFilters.add("User Defined Data Types"); // $NON-NLS-1$
		definedFilters.add("External Entities"); // $NON-NLS-1$
		definedFilters.add("Bridge Operations"); // $NON-NLS-1$
		definedFilters.add("Bridge Parameters"); // $NON-NLS-1$
		definedFilters.add("Enumerations"); // $NON-NLS-1$
		definedFilters.add("Enumerators"); // $NON-NLS-1$
		definedFilters.add("Core Data Types"); // $NON-NLS-1$
		definedFilters.add("Event Data Items"); // $NON-NLS-1$
		definedFilters.add("Sequences"); // $NON-NLS-1$
		definedFilters.add("Instances"); // $NON-NLS-1$
		definedFilters.add("Informal Instance Attributes"); // $NON-NLS-1$
		definedFilters.add("Informal Message Arguments"); // $NON-NLS-1$
		definedFilters.add("Event Message Arguments"); // $NON-NLS-1$
		definedFilters.add("Function Message Arguments"); // $NON-NLS-1$
		definedFilters.add("Class Message Arguments"); // $NON-NLS-1$
		definedFilters.add("Bridge Message Arguments"); // $NON-NLS-1$
		definedFilters.add("Imported Classes"); // $NON-NLS-1$
		definedFilters.add("Imported External Entities"); // $NON-NLS-1$
		definedFilters.add("Imported Function Packages"); // $NON-NLS-1$
		definedFilters.add("Imported Packages"); // $NON-NLS-1$
		definedFilters.add("Informal Class Attributes"); // $NON-NLS-1$
		definedFilters.add("Formal Instance Attributes"); // $NON-NLS-1$
		definedFilters.add("Actors"); // $NON-NLS-1$
		definedFilters.add("Incoming Synchronous Messages"); // $NON-NLS-1$
		definedFilters.add("Incoming Asynchronous Messages"); // $NON-NLS-1$
		definedFilters.add("Incoming Return Messages"); // $NON-NLS-1$
		definedFilters.add("Communications"); // $NON-NLS-1$
		definedFilters.add("Use Case Diagrams"); // $NON-NLS-1$
		definedFilters.add("Use Cases"); // $NON-NLS-1$
		definedFilters.add("Activities"); // $NON-NLS-1$
		definedFilters.add("Actions"); // $NON-NLS-1$
		definedFilters.add("ObjectNodes"); // $NON-NLS-1$
		definedFilters.add("Accept Event Actions"); // $NON-NLS-1$
		definedFilters.add("Send Signal Actions"); // $NON-NLS-1$
		definedFilters.add("Accept Time Event Actions"); // $NON-NLS-1$
		definedFilters.add("Interface Packages"); // $NON-NLS-1$
		definedFilters.add("Interfaces"); // $NON-NLS-1$
		definedFilters.add("Signals"); // $NON-NLS-1$
		definedFilters.add("Parameters"); // $NON-NLS-1$
		definedFilters.add("Component Packages"); // $NON-NLS-1$
		definedFilters.add("Components"); // $NON-NLS-1$
		definedFilters.add("Provided Interfaces"); // $NON-NLS-1$
		definedFilters.add("Required Interfaces"); // $NON-NLS-1$
		definedFilters.add("Required Interface Operations"); // $NON-NLS-1$
		definedFilters.add("Provided Interface Operations"); // $NON-NLS-1$
		definedFilters.add("Required Interface Signals"); // $NON-NLS-1$
		definedFilters.add("Provided Interface Signals"); // $NON-NLS-1$
		definedFilters.add("Interface Operations"); // $NON-NLS-1$
		definedFilters.add("Component References"); // $NON-NLS-1$
		definedFilters.add("Structured Data Types"); // $NON-NLS-1$
		definedFilters.add("Members"); // $NON-NLS-1$
		definedFilters.add("Ports"); // $NON-NLS-1$
		definedFilters.add("Imported Provided Interfaces"); // $NON-NLS-1$
		definedFilters.add("Imported Required Interfaces"); // $NON-NLS-1$
		definedFilters.add("Component Participants"); // $NON-NLS-1$
		definedFilters.add("Packages"); // $NON-NLS-1$
		definedFilters.add("Constant Specifications"); // $NON-NLS-1$
		definedFilters.add("Literal Symbolic Constants"); // $NON-NLS-1$
	}
} // FiltersContentProvider
