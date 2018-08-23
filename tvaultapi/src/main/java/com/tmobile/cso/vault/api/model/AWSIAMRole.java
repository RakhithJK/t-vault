package com.tmobile.cso.vault.api.model;

import java.io.Serializable;

public class AWSIAMRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5565582198381225072L;

	public AWSIAMRole() {
		// TODO Auto-generated constructor stub
	}

	private String role;
	private String auth_type;
	private String bound_iam_principal_arn;
	private String inferred_entity_type;
	private String inferred_aws_region;
	private String bound_iam_role_arn;
	private String[] policies;
	private Boolean resolve_aws_unique_ids;

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @return the auth_type
	 */
	public String getAuth_type() {
		return auth_type;
	}
	/**
	 * @return the bound_iam_principal_arn
	 */
	public String getBound_iam_principal_arn() {
		return bound_iam_principal_arn;
	}
	/**
	 * @return the policies
	 */
	public String[] getPolicies() {
		return policies;
	}
	/**
	 * @return the resolve_aws_unique_ids
	 */
	public Boolean getResolve_aws_unique_ids() {
		return resolve_aws_unique_ids;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @param auth_type the auth_type to set
	 */
	public void setAuth_type(String auth_type) {
		this.auth_type = auth_type;
	}
	/**
	 * @param bound_iam_principal_arn the bound_iam_principal_arn to set
	 */
	public void setBound_iam_principal_arn(String bound_iam_principal_arn) {
		this.bound_iam_principal_arn = bound_iam_principal_arn;
	}
	/**
	 * @param policies the policies to set
	 */
	public void setPolicies(String[] policies) {
		this.policies = policies;
	}
	/**
	 * @param resolve_aws_unique_ids the resolve_aws_unique_ids to set
	 */
	public void setResolve_aws_unique_ids(Boolean resolve_aws_unique_ids) {
		this.resolve_aws_unique_ids = resolve_aws_unique_ids;
	}
	/**
	 * @return the bound_iam_role_arn
	 */
	public String getBound_iam_role_arn() {
		return bound_iam_role_arn;
	}
	/**
	 * @param bound_iam_role_arn the bound_iam_role_arn to set
	 */
	public void setBound_iam_role_arn(String bound_iam_role_arn) {
		this.bound_iam_role_arn = bound_iam_role_arn;
	}
	/**
	 * @return the inferred_entity_type
	 */
	public String getInferred_entity_type() {
		return inferred_entity_type;
	}
	/**
	 * @param inferred_entity_type the inferred_entity_type to set
	 */
	public void setInferred_entity_type(String inferred_entity_type) {
		this.inferred_entity_type = inferred_entity_type;
	}
	/**
	 * @return the inferred_aws_region
	 */
	public String getInferred_aws_region() {
		return inferred_aws_region;
	}
	/**
	 * @param inferred_aws_region the inferred_aws_region to set
	 */
	public void setInferred_aws_region(String inferred_aws_region) {
		this.inferred_aws_region = inferred_aws_region;
	}

	
}
