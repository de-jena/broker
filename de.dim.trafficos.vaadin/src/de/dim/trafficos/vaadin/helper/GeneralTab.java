/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.vaadin.helper;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * 
 * @author ilenia
 * @since Feb 14, 2023
 */
public abstract class GeneralTab<T> extends VerticalLayout {

	/** serialVersionUID */
	private static final long serialVersionUID = -5538372422534592428L;
	
	protected List<T> result = new ArrayList<>();
	protected Button clearBtn, submitBtn;
	
	protected abstract void fillLayout();
	public abstract void clearTab();
	
	protected void createBtnLayout() {
		HorizontalLayout btnLayout = new HorizontalLayout();
		clearBtn = new Button("Clear", evt ->  {
			clearTab();
			submitBtn.setEnabled(false);
		});		
		submitBtn = new Button("Create");
		submitBtn.setEnabled(false);
		
		btnLayout.add(clearBtn, submitBtn);		
		add(btnLayout);		
	}
	
	public List<T> getResult() {
		return result;
	}
	
	public Button getClearBtn() {
		return clearBtn;
	}
	
	public Button getSubmitBtn() {
		return submitBtn;
	}

}
