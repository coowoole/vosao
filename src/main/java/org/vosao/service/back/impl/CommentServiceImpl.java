/**
 * Vosao CMS. Simple CMS for Google App Engine.
 * Copyright (C) 2009 Vosao development team
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * email: vosao.dev@gmail.com
 */

package org.vosao.service.back.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.vosao.service.ServiceResponse;
import org.vosao.service.back.CommentService;
import org.vosao.service.impl.AbstractServiceImpl;
import org.vosao.service.vo.CommentVO;

/**
 * @author Alexander Oleynik
 */
public class CommentServiceImpl extends AbstractServiceImpl 
		implements CommentService {

	private static Log logger = LogFactory.getLog(CommentServiceImpl.class);
	
	@Override
	public List<CommentVO> getByPage(String pageUrl) {
		return CommentVO.create(getDao().getCommentDao().getByPage(pageUrl));
	}

	@Override
	public ServiceResponse deleteComments(List<String> ids) {
		getBusiness().getCommentBusiness().remove(ids);
		return ServiceResponse.createSuccessResponse(
				"Comments were successfuly deleted");
	}

	@Override
	public ServiceResponse disableComments(List<String> ids) {
		getBusiness().getCommentBusiness().disable(ids);
		return ServiceResponse.createSuccessResponse(
				"Comments were successfuly disabled");
	}

	@Override
	public ServiceResponse enableComments(List<String> ids) {
		getBusiness().getCommentBusiness().enable(ids);
		return ServiceResponse.createSuccessResponse(
				"Comments were successfuly enabled");
	}

}