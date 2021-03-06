package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.ProvidedOperationBody_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.*;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_PROVIDED_OPERATION_BODY extends genericEvent_c {
	public abstract int getEvtcode();
}

public class ProvidedOperationBody_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public ProvidedOperationBody_c(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_id = IdAssigner.preprocessUUID(p_m_id);

		Object[] key = {m_action_id};
		addInstanceToMap(key);
	}
	static public ProvidedOperationBody_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(ProvidedOperationBody_c.class);
		ProvidedOperationBody_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_action_id};
			new_inst = (ProvidedOperationBody_c) instances.get(key);
		}
		String contentPath = PersistenceUtil.resolveRelativePath(p_localPath,
				new Path(p_contentPath));
		if (modelRoot.isNewCompareRoot()) {
			// for comparisons we do not want to change
			// the content path
			contentPath = p_contentPath;
		}
		if (new_inst != null && !modelRoot.isCompareRoot()) {
			PersistableModelComponent pmc = new_inst.getPersistableComponent();
			if (pmc == null) {
				// dangling reference, redo this instance
				new_inst.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_id = IdAssigner.preprocessUUID(p_m_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new ProvidedOperationBody_c(modelRoot, p_m_action_id,
					p_m_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public ProvidedOperationBody_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_id) {
		InstanceList instances = modelRoot
				.getInstanceList(ProvidedOperationBody_c.class);
		ProvidedOperationBody_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_action_id};
			source = (ProvidedOperationBody_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_id = IdAssigner.preprocessUUID(p_m_id);

				return source;
			}
		}
		// there is no instance matching the id
		ProvidedOperationBody_c new_inst = new ProvidedOperationBody_c(
				modelRoot, p_m_action_id, p_m_id);
		return new_inst;
	}
	public ProvidedOperationBody_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_action_id = IdAssigner.NULL_UUID;
		m_id = IdAssigner.NULL_UUID;
		Object[] key = {m_action_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_action_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_action_id != p_newKey) {

			m_action_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof ProvidedOperationBody_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof ProvidedOperationBody_c)) {
			return false;
		}

		ProvidedOperationBody_c me = (ProvidedOperationBody_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getAction_id()) || IdAssigner.NULL_UUID
				.equals(((ProvidedOperationBody_c) elem).getAction_id()))
				&& this != elem) {
			return false;
		}
		if (!getAction_id().equals(
				((ProvidedOperationBody_c) elem).getAction_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof ProvidedOperationBody_c)) {
			return false;
		}

		ProvidedOperationBody_c me = (ProvidedOperationBody_c) elem;
		if (!getAction_idCachedValue().equals(
				((ProvidedOperationBody_c) elem).getAction_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_action_id;
	private java.util.UUID m_id;

	// declare association references from this class

	// referring navigation

	ProvidedOperation_c SpecifiesProcessingForProvidedOperation;
	public void relateAcrossR687To(ProvidedOperation_c target) {
		relateAcrossR687To(target, true);
	}
	public void relateAcrossR687To(ProvidedOperation_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == SpecifiesProcessingForProvidedOperation)
			return; // already related

		if (SpecifiesProcessingForProvidedOperation != target) {

			Object oldKey = getInstanceKey();

			if (SpecifiesProcessingForProvidedOperation != null) {

				SpecifiesProcessingForProvidedOperation
						.clearBackPointerR687To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"ProvidedOperationBody_c.relateAcrossR687To(ProvidedOperation_c target)",
									"Relate performed across R687 from Provided Operation Body to Provided Operation without unrelate of prior instance.");
				}
			}

			SpecifiesProcessingForProvidedOperation = target;
			if (IdAssigner.NULL_UUID.equals(target.getId())) {
				// do not update cached value
			} else {
				// update cached value
				m_id = target.getIdCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR687To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR687From(ProvidedOperation_c target) {
		unrelateAcrossR687From(target, true);
	}
	public void unrelateAcrossR687From(ProvidedOperation_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (SpecifiesProcessingForProvidedOperation == null)
			return; // already unrelated

		if (target != SpecifiesProcessingForProvidedOperation) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R687",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR687To(this);
		}

		if (SpecifiesProcessingForProvidedOperation != null) {

			m_id = SpecifiesProcessingForProvidedOperation.getId();
			if (IdAssigner.NULL_UUID.equals(m_id)) {
				m_id = SpecifiesProcessingForProvidedOperation
						.getIdCachedValue();
			}
			SpecifiesProcessingForProvidedOperation = null;
			target.removeRef();
		}
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR687(
			ProvidedOperation_c[] targets) {
		return getOneACT_POBOnR687(targets, null);
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR687(
			ProvidedOperation_c[] targets, ClassQueryInterface_c test) {
		ProvidedOperationBody_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneACT_POBOnR687(targets[i], test);
			}
		}

		return ret_val;
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR687(
			ProvidedOperation_c target) {
		return getOneACT_POBOnR687(target, null);
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR687(
			ProvidedOperation_c target, boolean loadComponent) {
		return getOneACT_POBOnR687(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR687(
			ProvidedOperation_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneACT_POBOnR687(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR687(
			ModelRoot modelRoot, ProvidedOperation_c target,
			ClassQueryInterface_c test) {
		return getOneACT_POBOnR687(modelRoot, target, test, true);
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR687(
			ModelRoot modelRoot, ProvidedOperation_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneACT_POBOnR687(modelRoot, target, test);
	}
	private static ProvidedOperationBody_c find_getOneACT_POBOnR687(
			ModelRoot modelRoot, ProvidedOperation_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			ProvidedOperationBody_c source = (ProvidedOperationBody_c) target.backPointer_ProvidedOperationBody_R687;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static ProvidedOperationBody_c[] getManyACT_POBsOnR687(
			ProvidedOperation_c[] targets) {
		return getManyACT_POBsOnR687(targets, null);
	}
	public static ProvidedOperationBody_c[] getManyACT_POBsOnR687(
			ProvidedOperation_c[] targets, boolean loadComponent) {
		return getManyACT_POBsOnR687(targets, null, loadComponent);
	}
	public static ProvidedOperationBody_c[] getManyACT_POBsOnR687(
			ProvidedOperation_c[] targets, ClassQueryInterface_c test) {
		return getManyACT_POBsOnR687(targets, test, true);
	}

	public static ProvidedOperationBody_c[] getManyACT_POBsOnR687(
			ProvidedOperation_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new ProvidedOperationBody_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(ProvidedOperationBody_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			ProvidedOperationBody_c source = (ProvidedOperationBody_c) targets[i].backPointer_ProvidedOperationBody_R687;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			ProvidedOperationBody_c[] ret_set = new ProvidedOperationBody_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new ProvidedOperationBody_c[0];
		}
	}

	public static ProvidedOperationBody_c[] getManyACT_POBsOnR687(
			ProvidedOperation_c target) {
		if (target != null) {
			ProvidedOperation_c[] targetArray = new ProvidedOperation_c[1];
			targetArray[0] = target;
			return getManyACT_POBsOnR687(targetArray);
		} else {
			ProvidedOperationBody_c[] result = new ProvidedOperationBody_c[0];
			return result;
		}
	}

	public static ProvidedOperationBody_c[] getManyACT_POBsOnR687(
			ProvidedOperation_c target, boolean loadComponent) {
		if (target != null) {
			ProvidedOperation_c[] targetArray = new ProvidedOperation_c[1];
			targetArray[0] = target;
			return getManyACT_POBsOnR687(targetArray, loadComponent);
		} else {
			ProvidedOperationBody_c[] result = new ProvidedOperationBody_c[0];
			return result;
		}
	}

	// referring navigation

	Body_c IsSupertypeBody;
	public void relateAcrossR698To(Body_c target) {
		relateAcrossR698To(target, true);
	}
	public void relateAcrossR698To(Body_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeBody)
			return; // already related

		if (IsSupertypeBody != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeBody != null) {

				IsSupertypeBody.clearBackPointerR698To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"ProvidedOperationBody_c.relateAcrossR698To(Body_c target)",
									"Relate performed across R698 from Provided Operation Body to Body without unrelate of prior instance.");
				}
			}

			IsSupertypeBody = target;
			m_action_id = target.getAction_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR698To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR698From(Body_c target) {
		unrelateAcrossR698From(target, true);
	}
	public void unrelateAcrossR698From(Body_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeBody == null)
			return; // already unrelated

		if (target != IsSupertypeBody) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R698",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR698To(this);
		}

		if (IsSupertypeBody != null) {

			m_action_id = IsSupertypeBody.getAction_id();
			IsSupertypeBody = null;
			target.removeRef();
		}
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR698(Body_c[] targets) {
		return getOneACT_POBOnR698(targets, null);
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR698(Body_c[] targets,
			ClassQueryInterface_c test) {
		ProvidedOperationBody_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneACT_POBOnR698(targets[i], test);
			}
		}

		return ret_val;
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR698(Body_c target) {
		return getOneACT_POBOnR698(target, null);
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR698(Body_c target,
			boolean loadComponent) {
		return getOneACT_POBOnR698(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR698(Body_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneACT_POBOnR698(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR698(
			ModelRoot modelRoot, Body_c target, ClassQueryInterface_c test) {
		return getOneACT_POBOnR698(modelRoot, target, test, true);
	}

	public static ProvidedOperationBody_c getOneACT_POBOnR698(
			ModelRoot modelRoot, Body_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneACT_POBOnR698(modelRoot, target, test);
	}
	private static ProvidedOperationBody_c find_getOneACT_POBOnR698(
			ModelRoot modelRoot, Body_c target, ClassQueryInterface_c test) {
		if (target != null) {
			ProvidedOperationBody_c source = (ProvidedOperationBody_c) target.backPointer_IsSubtypeProvidedOperationBodyIsSubtype_R698;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static ProvidedOperationBody_c[] getManyACT_POBsOnR698(
			Body_c[] targets) {
		return getManyACT_POBsOnR698(targets, null);
	}
	public static ProvidedOperationBody_c[] getManyACT_POBsOnR698(
			Body_c[] targets, boolean loadComponent) {
		return getManyACT_POBsOnR698(targets, null, loadComponent);
	}
	public static ProvidedOperationBody_c[] getManyACT_POBsOnR698(
			Body_c[] targets, ClassQueryInterface_c test) {
		return getManyACT_POBsOnR698(targets, test, true);
	}

	public static ProvidedOperationBody_c[] getManyACT_POBsOnR698(
			Body_c[] targets, ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new ProvidedOperationBody_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(ProvidedOperationBody_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			ProvidedOperationBody_c source = (ProvidedOperationBody_c) targets[i].backPointer_IsSubtypeProvidedOperationBodyIsSubtype_R698;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			ProvidedOperationBody_c[] ret_set = new ProvidedOperationBody_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new ProvidedOperationBody_c[0];
		}
	}

	public static ProvidedOperationBody_c[] getManyACT_POBsOnR698(Body_c target) {
		if (target != null) {
			Body_c[] targetArray = new Body_c[1];
			targetArray[0] = target;
			return getManyACT_POBsOnR698(targetArray);
		} else {
			ProvidedOperationBody_c[] result = new ProvidedOperationBody_c[0];
			return result;
		}
	}

	public static ProvidedOperationBody_c[] getManyACT_POBsOnR698(
			Body_c target, boolean loadComponent) {
		if (target != null) {
			Body_c[] targetArray = new Body_c[1];
			targetArray[0] = target;
			return getManyACT_POBsOnR698(targetArray, loadComponent);
		} else {
			ProvidedOperationBody_c[] result = new ProvidedOperationBody_c[0];
			return result;
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		if (SpecifiesProcessingForProvidedOperation == null) {
			// R687
			ProvidedOperation_c relInst56261 = (ProvidedOperation_c) baseRoot
					.getInstanceList(ProvidedOperation_c.class).get(
							new Object[]{m_id});
			// if there was no local element, check for any global elements
			// failing that proceed to check other model roots
			if (relInst56261 == null) {
				relInst56261 = (ProvidedOperation_c) Ooaofooa
						.getDefaultInstance()
						.getInstanceList(ProvidedOperation_c.class)
						.get(new Object[]{m_id});
			}
			if (relInst56261 == null && searchAllRoots
					&& !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
					if (roots[i].isCompareRoot()) {
						// never use elements from any compare root
						continue;
					}
					relInst56261 = (ProvidedOperation_c) roots[i]
							.getInstanceList(ProvidedOperation_c.class).get(
									new Object[]{m_id});
					if (relInst56261 != null)
						break;
				}
			}
			//synchronized
			if (relInst56261 != null) {
				if (relateProxies || !isProxy()
						|| (inSameComponent(this, relInst56261) && !isProxy())) {
					relInst56261.relateAcrossR687To(this, notifyChanges);
				}
			}
		}

		// R698
		Body_c relInst56262 = (Body_c) baseRoot.getInstanceList(Body_c.class)
				.get(new Object[]{m_action_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst56262 == null) {
			relInst56262 = (Body_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Body_c.class)
					.get(new Object[]{m_action_id});
		}
		if (relInst56262 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst56262 = (Body_c) roots[i].getInstanceList(Body_c.class)
						.get(new Object[]{m_action_id});
				if (relInst56262 != null)
					break;
			}
		}
		//synchronized
		if (relInst56262 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst56262) && !isProxy())) {
				relInst56262.relateAcrossR698To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R687
		// SPR_PO
		inst = SpecifiesProcessingForProvidedOperation;
		unrelateAcrossR687From(SpecifiesProcessingForProvidedOperation,
				notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// R698
		// ACT_ACT
		inst = IsSupertypeBody;
		unrelateAcrossR698From(IsSupertypeBody, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(ProvidedOperationBody_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final ProvidedOperationBody_c inst = (ProvidedOperationBody_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(ProvidedOperationBody_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static ProvidedOperationBody_c ProvidedOperationBodyInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		ProvidedOperationBody_c result = findProvidedOperationBodyInstance(
				modelRoot, test, loadComponent);
		return result;
	}
	private static ProvidedOperationBody_c findProvidedOperationBodyInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(ProvidedOperationBody_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				ProvidedOperationBody_c x = (ProvidedOperationBody_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static ProvidedOperationBody_c ProvidedOperationBodyInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return ProvidedOperationBodyInstance(modelRoot, test, true);
	}

	public static ProvidedOperationBody_c ProvidedOperationBodyInstance(
			ModelRoot modelRoot) {
		return ProvidedOperationBodyInstance(modelRoot, null, true);
	}

	public static ProvidedOperationBody_c[] ProvidedOperationBodyInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(ProvidedOperationBody_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				ProvidedOperationBody_c x = (ProvidedOperationBody_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				ProvidedOperationBody_c[] ret_set = new ProvidedOperationBody_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new ProvidedOperationBody_c[0];
			}
		}
	}
	public static ProvidedOperationBody_c[] ProvidedOperationBodyInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return ProvidedOperationBodyInstances(modelRoot, test, true);
	}
	public static ProvidedOperationBody_c[] ProvidedOperationBodyInstances(
			ModelRoot modelRoot) {
		return ProvidedOperationBodyInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Provided Operation Body.dispose call: ";
		ProvidedOperation_c testR687Inst = ProvidedOperation_c
				.getOneSPR_POOnR687(this, false);

		if (testR687Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "687 ";
		}
		Body_c testR698Inst7 = Body_c.getOneACT_ACTOnR698(this, false);

		if (testR698Inst7 != null) {
			delete_error = true;
			errorMsg = errorMsg + "698 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Provided Operation Body",
						errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CorePlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("action_id")) {
			return true;
		}
		if (attributeName.equals("id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getAction_idLongBased() {
		if (IsSupertypeBody != null) {
			return IsSupertypeBody.getAction_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getAction_id() {
		if (IsSupertypeBody != null) {
			return IsSupertypeBody.getAction_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeBody != null);

	}

	public java.util.UUID getAction_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_action_id))
			return m_action_id;
		else
			return getAction_id();
	}

	public void setAction_id(java.util.UUID newValue) {
		m_action_id = IdAssigner.preprocessUUID(newValue);
	}
	public long getIdLongBased() {
		if (SpecifiesProcessingForProvidedOperation != null) {
			return SpecifiesProcessingForProvidedOperation.getIdLongBased();
		}
		return 0;
	}
	public java.util.UUID getId() {
		if (SpecifiesProcessingForProvidedOperation != null) {
			return SpecifiesProcessingForProvidedOperation.getId();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getIdCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_id))
			return m_id;
		else
			return getId();
	}

	public void setId(java.util.UUID newValue) {
		m_id = IdAssigner.preprocessUUID(newValue);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Provided Operation Body", //$NON-NLS-1$
						" Operation entered: Provided Operation Body::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		ProvidedOperationBody_c[] objs = ProvidedOperationBody_c
				.ProvidedOperationBodyInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Provided Operation Body", //$NON-NLS-1$
						" Operation entered: Provided Operation Body::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class ProvidedOperationBody_c_test56264_c
				implements
					ClassQueryInterface_c {
			ProvidedOperationBody_c_test56264_c(java.util.UUID p56265) {
				m_p56265 = p56265;
			}
			private java.util.UUID m_p56265;
			public boolean evaluate(Object candidate) {
				ProvidedOperationBody_c selected = (ProvidedOperationBody_c) candidate;
				boolean retval = false;
				retval = (selected.getAction_id().equals(m_p56265));
				return retval;
			}
		}

		ProvidedOperationBody_c[] objs56263 = ProvidedOperationBody_c
				.ProvidedOperationBodyInstances(modelRoot,
						new ProvidedOperationBody_c_test56264_c(getAction_id()));

		if (((objs56263.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Provided Operation Body", //$NON-NLS-1$
								"Consistency: Object: Provided Operation Body: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56263.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Provided Operation Body: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56263.length), e);
			}
			retval = false;

		}

		if (((objs56263.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Provided Operation Body", //$NON-NLS-1$
								"Consistency: Object: Provided Operation Body: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs56263.length)
										+ " Action_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Provided Operation Body: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56263.length)
										+ " Action_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Provided Operation Body is a subtype in association: rel.Numb = 698
		// The supertype class is: Body
		class Body_c_test56269_c implements ClassQueryInterface_c {
			Body_c_test56269_c(java.util.UUID p56270) {
				m_p56270 = p56270;
			}
			private java.util.UUID m_p56270;
			public boolean evaluate(Object candidate) {
				Body_c selected = (Body_c) candidate;
				boolean retval = false;
				retval = (selected.getAction_id().equals(m_p56270));
				return retval;
			}
		}

		Body_c[] objs56268 = Body_c.BodyInstances(modelRoot,
				new Body_c_test56269_c(getAction_id()));

		if (((objs56268.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Provided Operation Body", //$NON-NLS-1$
								"Consistency: Object: Provided Operation Body: Association: 698: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56268.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Provided Operation Body: Association: 698: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56268.length), e);
			}
			retval = false;

		}

		// Provided Operation Body is a referring class in association: rel.Numb = 687
		// The participating class is: Provided Operation
		class ProvidedOperation_c_test56272_c implements ClassQueryInterface_c {
			ProvidedOperation_c_test56272_c(java.util.UUID p56273) {
				m_p56273 = p56273;
			}
			private java.util.UUID m_p56273;
			public boolean evaluate(Object candidate) {
				ProvidedOperation_c selected = (ProvidedOperation_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p56273));
				return retval;
			}
		}

		ProvidedOperation_c[] objs56271 = ProvidedOperation_c
				.ProvidedOperationInstances(modelRoot,
						new ProvidedOperation_c_test56272_c(getId()));

		// The participant is unconditional
		// The multiplicity of the participant is one
		if (((objs56271.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Provided Operation Body", //$NON-NLS-1$
								"Consistency: Object: Provided Operation Body: Association: 687: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs56271.length)
										+ " Id: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Provided Operation Body: Association: 687: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56271.length)
										+ " Id: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Provided Operation Body",
				" Operation entered: ProvidedOperationBody::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		ProvidedOperation_c v_act = ProvidedOperation_c
				.getOneSPR_POOnR687(this);

		if (((v_act != null))) {

			this.unrelateAcrossR687From(v_act);

		}

		delete();

	} // End dispose
	public java.util.UUID Getcontainingcomponentid() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Provided Operation Body",
						" Operation entered: ProvidedOperationBody::Getcontainingcomponentid");
		final ModelRoot modelRoot = getModelRoot();
		ProvidedOperation_c v_providedOp = ProvidedOperation_c
				.getOneSPR_POOnR687(this);

		return v_providedOp.Getcomponentid();

	} // End getContainingComponentId
	public java.util.UUID Getcontainerid() {
		Ooaofooa.log.println(ILogger.OPERATION, "Provided Operation Body",
				" Operation entered: ProvidedOperationBody::Getcontainerid");
		final ModelRoot modelRoot = getModelRoot();
		ProvidedOperation_c v_providedOp = ProvidedOperation_c
				.getOneSPR_POOnR687(this);

		return v_providedOp.Getcomponentid();

	} // End getContainerId
	public String Getpath() {
		Ooaofooa.log.println(ILogger.OPERATION, "Provided Operation Body",
				" Operation entered: ProvidedOperationBody::Getpath");
		final ModelRoot modelRoot = getModelRoot();
		ProvidedOperation_c v_providedOp = ProvidedOperation_c
				.getOneSPR_POOnR687(this);

		String v_providedOpPath = "";

		String v_providedOpName = "";

		if (((v_providedOp != null))) {

			v_providedOpName = v_providedOp.getName();

			Component_c v_comp = Component_c
					.getOneC_COnR4010(Port_c.getOneC_POOnR4016(InterfaceReference_c.getOneC_IROnR4009(Provision_c
							.getOneC_POnR4501(ProvidedExecutableProperty_c
									.getOneSPR_PEPOnR4503(v_providedOp)))));

			v_providedOpPath = v_comp.Getpath(true, v_providedOpName);

		}

		return v_providedOpPath;

	} // End getPath

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Provided Operation Body
