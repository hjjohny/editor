package com.mentor.nucleus.bp.core.ui;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/ui/MoveUpOnC_IOAction.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_object_action.inc
// Version:      $Revision: 1.30 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is the main BridgePoint entry point for the action that
// creates new Move Ups.
//
import java.util.Iterator;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.util.OoaofgraphicsUtil;
import com.mentor.nucleus.bp.core.util.RenameActionUtil;
import com.mentor.nucleus.bp.core.util.TransactionUtil;
import com.mentor.nucleus.bp.core.util.UIUtil;

public class MoveUpOnC_IOAction implements IObjectActionDelegate {

	/**
	 * Constructor for MoveUpOnC_IOAction.
	 */
	public MoveUpOnC_IOAction() {
		super();
	}
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// The part is mainly needed to locate the selection provider, and
		// we cache our selection in core so no action is needed here.
	}
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IStructuredSelection structuredSelection = Selection.getInstance()
				.getStructuredSelection();
		C_IO_MoveUp(structuredSelection);

	}
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}
	private void C_IO_MoveUp(IStructuredSelection selection) {
		// Assign the context selection variables with the action context 
		// Assign the context selection variable with the action context 
		Object context = selection.iterator().next();
		InterfaceOperation_c v_item = (InterfaceOperation_c) context;
		PersistableModelComponent.ensureCoreDataTypesAvailable(v_item
				.getModelRoot());

		TransactionUtil.TransactionGroup transactionGroup = TransactionUtil
				.startTransactionsOnSelectedModelRoots("Interface Operation Move Up");
		try {
			// Ensure that actions take place between Verifier Activity executions
			Ooaofooa.beginSaveOperation();
			if (v_item != null) {
				v_item.Moveup();
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

			// end critical section
			Ooaofooa.endSaveOperation();
			// catch all exceptions and cancel the transactions
		} catch (Exception e) {
			Ooaofooa.endSaveOperation();
			TransactionUtil.cancelTransactions(transactionGroup, e);
			CorePlugin.logError(
					"Transaction: Interface Operation Move Up failed", e);//$NON-NLS-1$
		}
		TransactionUtil.endTransactions(transactionGroup);

	}
} // end MoveUpOnC_IOAction
