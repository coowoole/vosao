/**
 * Vosao CMS. Simple CMS for Google App Engine.
 * 
 * Copyright (C) 2009-2010 Vosao development team.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * email: vosao.dev@gmail.com
 */

package org.vosao.entity;

import static org.vosao.utils.EntityUtil.*;

import java.util.HashMap;
import java.util.Map;

import com.google.appengine.api.datastore.Entity;

public class ConfigEntity extends BaseEntityImpl {

	private static final long serialVersionUID = 2L;

	private String googleAnalyticsId;
	private String siteEmail;
	private String siteDomain;
	private String editExt;
	private boolean enableRecaptcha;
	private String recaptchaPrivateKey;
	private String recaptchaPublicKey;
	private String commentsEmail;
	private String commentsTemplate;
	private String version;
	private String siteUserLoginUrl;
	private boolean enablePicasa;
	private String picasaUser;
	private String picasaPassword;
	private boolean enableCkeditor;
	private Map<String, String> attributes;
	private String defaultTimezone;
	private String defaultLanguage;

	public ConfigEntity() {
		commentsTemplate = "";
		enableCkeditor = true;
		attributes = new HashMap<String, String>();
		defaultLanguage = "en";
	}

	@Override
	public void load(Entity entity) {
		super.load(entity);
		googleAnalyticsId = getStringProperty(entity, "googleAnalyticsId");
		siteEmail = getStringProperty(entity, "siteEmail");
		siteDomain = getStringProperty(entity, "siteDomain");
		editExt = getStringProperty(entity, "editExt");
		enableRecaptcha = getBooleanProperty(entity, "enableRecaptcha", false);
		recaptchaPrivateKey = getStringProperty(entity, "recaptchaPrivateKey");
		recaptchaPublicKey = getStringProperty(entity, "recaptchaPublicKey");
		commentsEmail = getStringProperty(entity, "commentsEmail");
		commentsTemplate = getTextProperty(entity, "commentsTemplate");
		version = getStringProperty(entity, "version");
		siteUserLoginUrl = getStringProperty(entity, "siteUserLoginUrl");
		enablePicasa = getBooleanProperty(entity, "enablePicasa", false);
		picasaUser = getStringProperty(entity, "picasaUser");
		picasaPassword = getStringProperty(entity, "picasaPassword");
		enableCkeditor = getBooleanProperty(entity, "enableCkeditor", true);
		attributes = getMapProperty(entity, "attributes");
		defaultTimezone = getStringProperty(entity, "defaultTimezone");
		defaultLanguage = getStringProperty(entity, "defaultLanguage", "en");
	}
	
	@Override
	public void save(Entity entity) {
		super.save(entity);
		setProperty(entity, "googleAnalyticsId", googleAnalyticsId, false);
		setProperty(entity, "siteEmail", siteEmail, false);
		setProperty(entity, "siteDomain", siteDomain, false);
		setProperty(entity, "editExt", editExt, false);
		setProperty(entity, "enableRecaptcha", enableRecaptcha, false);
		setProperty(entity, "recaptchaPrivateKey", recaptchaPrivateKey, false);
		setProperty(entity, "recaptchaPublicKey", recaptchaPublicKey, false);
		setProperty(entity, "commentsEmail", commentsEmail, false);
		setTextProperty(entity, "commentsTemplate", commentsTemplate);
		setProperty(entity, "version", version, false);
		setProperty(entity, "siteUserLoginUrl", siteUserLoginUrl, false);
		setProperty(entity, "enablePicasa", enablePicasa, false);
		setProperty(entity, "picasaUser", picasaUser, false);
		setProperty(entity, "picasaPassword", picasaPassword, false);
		setProperty(entity, "enableCkeditor", enableCkeditor, false);
		setProperty(entity, "attributes", attributes);
		setProperty(entity, "defaultTimezone", defaultTimezone, false);
		setProperty(entity, "defaultLanguage", defaultLanguage, false);
	}

	public String getGoogleAnalyticsId() {
		return googleAnalyticsId;
	}

	public void setGoogleAnalyticsId(String googleAnalyticsId) {
		this.googleAnalyticsId = googleAnalyticsId;
	}

	public String getSiteEmail() {
		return siteEmail;
	}

	public void setSiteEmail(String siteEmail) {
		this.siteEmail = siteEmail;
	}

	public String getSiteDomain() {
		return siteDomain;
	}

	public void setSiteDomain(String siteDomain) {
		this.siteDomain = siteDomain;
	}

	public String getEditExt() {
		return editExt;
	}

	public void setEditExt(String editExt) {
		this.editExt = editExt;
	}

	public String getRecaptchaPrivateKey() {
		return recaptchaPrivateKey;
	}

	public void setRecaptchaPrivateKey(String recaptchaPrivateKey) {
		this.recaptchaPrivateKey = recaptchaPrivateKey;
	}

	public String getRecaptchaPublicKey() {
		return recaptchaPublicKey;
	}

	public void setRecaptchaPublicKey(String recaptchaPublicKey) {
		this.recaptchaPublicKey = recaptchaPublicKey;
	}

	public String getCommentsEmail() {
		return commentsEmail;
	}

	public void setCommentsEmail(String commentsEmail) {
		this.commentsEmail = commentsEmail;
	}

	public String getCommentsTemplate() {
		return commentsTemplate;
	}

	public void setCommentsTemplate(String commentsTemplate) {
		this.commentsTemplate = commentsTemplate;
	}

	public boolean isEnableRecaptcha() {
		return enableRecaptcha;
	}

	public void setEnableRecaptcha(boolean enableRecaptcha) {
		this.enableRecaptcha = enableRecaptcha;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSiteUserLoginUrl() {
		return siteUserLoginUrl;
	}

	public void setSiteUserLoginUrl(String siteUserLoginUrl) {
		this.siteUserLoginUrl = siteUserLoginUrl;
	}

	public boolean isEnablePicasa() {
		return enablePicasa;
	}

	public void setEnablePicasa(boolean enablePicasa) {
		this.enablePicasa = enablePicasa;
	}

	public String getPicasaUser() {
		return picasaUser;
	}

	public void setPicasaUser(String picasaUser) {
		this.picasaUser = picasaUser;
	}

	public String getPicasaPassword() {
		return picasaPassword;
	}

	public void setPicasaPassword(String picasaPassword) {
		this.picasaPassword = picasaPassword;
	}

	public boolean isEnableCkeditor() {
		return enableCkeditor;
	}

	public void setEnableCkeditor(boolean value) {
		this.enableCkeditor = value;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

    public void setAttribute(String name, String value) {
    	attributes.put(name, value);
    }
    
    public String getAttribute(String name) {
    	return attributes.get(name);
    }

	public String getDefaultTimezone() {
		return defaultTimezone;
	}

	public void setDefaultTimezone(String defaultTimezone) {
		this.defaultTimezone = defaultTimezone;
	}

	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}
}
