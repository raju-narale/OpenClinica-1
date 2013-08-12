// default package
// Generated Jul 31, 2013 2:03:33 PM by Hibernate Tools 3.4.0.CR1
package org.akaza.openclinica.domain.datamap;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.akaza.openclinica.domain.DataMapDomainObject;
import org.akaza.openclinica.domain.Status;
import org.akaza.openclinica.domain.user.UserAccount;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

/**
 * Study generated by hbm2java
 */
@Entity
@Table(name = "study", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "oc_oid"))
@GenericGenerator(name = "id-generator", strategy = "native", parameters = { @Parameter(name = "sequence", value = "study_study_id_seq") })
public class Study   extends DataMapDomainObject {

	private int studyId;
	private UserAccount userAccount;
	private StudyType studyType;
	private Study study;
	private Status status;
	private String uniqueIdentifier;
	private String secondaryIdentifier;
	private String name;
	private String summary;
	private Date datePlannedStart;
	private Date datePlannedEnd;
	private Date dateCreated;
	private Date dateUpdated;
	private Integer updateId;
	private String principalInvestigator;
	private String facilityName;
	private String facilityCity;
	private String facilityState;
	private String facilityZip;
	private String facilityCountry;
	private String facilityRecruitmentStatus;
	private String facilityContactName;
	private String facilityContactDegree;
	private String facilityContactPhone;
	private String facilityContactEmail;
	private String protocolType;
	private String protocolDescription;
	private Date protocolDateVerification;
	private String phase;
	private Integer expectedTotalEnrollment;
	private String sponsor;
	private String collaborators;
	private String medlineIdentifier;
	private String url;
	private String urlDescription;
	private String conditions;
	private String keywords;
	private String eligibility;
	private String gender;
	private String ageMax;
	private String ageMin;
	private Boolean healthyVolunteerAccepted;
	private String purpose;
	private String allocation;
	private String masking;
	private String control;
	private String assignment;
	private String endpoint;
	private String interventions;
	private String duration;
	private String selection;
	private String timing;
	private String officialTitle;
	private Boolean resultsReference;
	private String oc_oid;
	private Integer oldStatusId;
	private List<CrfBean> crfs ;
	private List<StudyEventDefinition> studyEventDefinitions ;
	private List<Study> studies;
	private List<StudyUserRole> studyUserRoles;
	//private Set datasets = new HashSet(0);
	private List<StudyParameterValue> studyParameterValues;
	private List<StudySubject> studySubjects ;
	private List<EventDefinitionCrf> eventDefinitionCrfs;
	private List<DiscrepancyNote> discrepancyNotes ;
	private List<StudyModuleStatus> studyModuleStatuses ;
	private Integer version;

	public Study() {
	}

	public Study(int studyId, String ocOid) {
		this.studyId = studyId;
		this.oc_oid = ocOid;
	}

	public Study(int studyId, UserAccount userAccount, StudyType studyType,
			Study study, Status status, String uniqueIdentifier,
			String secondaryIdentifier, String name, String summary,
			Date datePlannedStart, Date datePlannedEnd, Date dateCreated,
			Date dateUpdated, Integer updateId, String principalInvestigator,
			String facilityName, String facilityCity, String facilityState,
			String facilityZip, String facilityCountry,
			String facilityRecruitmentStatus, String facilityContactName,
			String facilityContactDegree, String facilityContactPhone,
			String facilityContactEmail, String protocolType,
			String protocolDescription, Date protocolDateVerification,
			String phase, Integer expectedTotalEnrollment, String sponsor,
			String collaborators, String medlineIdentifier, String url,
			String urlDescription, String conditions, String keywords,
			String eligibility, String gender, String ageMax, String ageMin,
			Boolean healthyVolunteerAccepted, String purpose,
			String allocation, String masking, String control,
			String assignment, String endpoint, String interventions,
			String duration, String selection, String timing,
			String officialTitle, Boolean resultsReference, String ocOid,
			Integer oldStatusId, List<CrfBean> crfs, List<StudyEventDefinition> studyEventDefinitions,
			List<Study> studies, List<StudyUserRole> studyUserRoles, Set datasets,
			List<StudyParameterValue> studyParameterValues, List<StudySubject> studySubjects,
			List<EventDefinitionCrf> eventDefinitionCrfs, List<DiscrepancyNote> discrepancyNotes,
			List<StudyModuleStatus> studyModuleStatuses) {
		this.studyId = studyId;
		this.userAccount = userAccount;
		this.studyType = studyType;
		this.study = study;
		this.status = status;
		this.uniqueIdentifier = uniqueIdentifier;
		this.secondaryIdentifier = secondaryIdentifier;
		this.name = name;
		this.summary = summary;
		this.datePlannedStart = datePlannedStart;
		this.datePlannedEnd = datePlannedEnd;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.updateId = updateId;
		this.principalInvestigator = principalInvestigator;
		this.facilityName = facilityName;
		this.facilityCity = facilityCity;
		this.facilityState = facilityState;
		this.facilityZip = facilityZip;
		this.facilityCountry = facilityCountry;
		this.facilityRecruitmentStatus = facilityRecruitmentStatus;
		this.facilityContactName = facilityContactName;
		this.facilityContactDegree = facilityContactDegree;
		this.facilityContactPhone = facilityContactPhone;
		this.facilityContactEmail = facilityContactEmail;
		this.protocolType = protocolType;
		this.protocolDescription = protocolDescription;
		this.protocolDateVerification = protocolDateVerification;
		this.phase = phase;
		this.expectedTotalEnrollment = expectedTotalEnrollment;
		this.sponsor = sponsor;
		this.collaborators = collaborators;
		this.medlineIdentifier = medlineIdentifier;
		this.url = url;
		this.urlDescription = urlDescription;
		this.conditions = conditions;
		this.keywords = keywords;
		this.eligibility = eligibility;
		this.gender = gender;
		this.ageMax = ageMax;
		this.ageMin = ageMin;
		this.healthyVolunteerAccepted = healthyVolunteerAccepted;
		this.purpose = purpose;
		this.allocation = allocation;
		this.masking = masking;
		this.control = control;
		this.assignment = assignment;
		this.endpoint = endpoint;
		this.interventions = interventions;
		this.duration = duration;
		this.selection = selection;
		this.timing = timing;
		this.officialTitle = officialTitle;
		this.resultsReference = resultsReference;
		this.oc_oid = ocOid;
		this.oldStatusId = oldStatusId;
		this.crfs = crfs;
		this.studyEventDefinitions = studyEventDefinitions;
		this.studies = studies;
		this.studyUserRoles = studyUserRoles;
	//	this.datasets = datasets;
		this.studyParameterValues = studyParameterValues;
		this.studySubjects = studySubjects;
		this.eventDefinitionCrfs = eventDefinitionCrfs;
		this.discrepancyNotes = discrepancyNotes;
		this.studyModuleStatuses = studyModuleStatuses;
	}

	@Id
	@GeneratedValue(generator = "id-generator")
	@Column(name = "study_id", unique = true, nullable = false)
	public int getStudyId() {
		return this.studyId;
	}

	public void setStudyId(int studyId) {
		this.studyId = studyId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner_id")
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@JoinColumn(name = "type_id")
	public StudyType getStudyType() {
		return this.studyType;
	}

	public void setStudyType(StudyType studyType) {
		this.studyType = studyType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_study_id")
	public Study getStudy() {
		return this.study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

	 @Type(type = "status")
	@JoinColumn(name = "status_id")
	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Column(name = "unique_identifier", length = 30)
	public String getUniqueIdentifier() {
		return this.uniqueIdentifier;
	}

	public void setUniqueIdentifier(String uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

	@Column(name = "secondary_identifier")
	public String getSecondaryIdentifier() {
		return this.secondaryIdentifier;
	}

	public void setSecondaryIdentifier(String secondaryIdentifier) {
		this.secondaryIdentifier = secondaryIdentifier;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "summary")
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_planned_start", length = 4)
	public Date getDatePlannedStart() {
		return this.datePlannedStart;
	}

	public void setDatePlannedStart(Date datePlannedStart) {
		this.datePlannedStart = datePlannedStart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_planned_end", length = 4)
	public Date getDatePlannedEnd() {
		return this.datePlannedEnd;
	}

	public void setDatePlannedEnd(Date datePlannedEnd) {
		this.datePlannedEnd = datePlannedEnd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_created", length = 4)
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_updated", length = 4)
	public Date getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	@Column(name = "update_id")
	public Integer getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	@Column(name = "principal_investigator")
	public String getPrincipalInvestigator() {
		return this.principalInvestigator;
	}

	public void setPrincipalInvestigator(String principalInvestigator) {
		this.principalInvestigator = principalInvestigator;
	}

	@Column(name = "facility_name")
	public String getFacilityName() {
		return this.facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	@Column(name = "facility_city")
	public String getFacilityCity() {
		return this.facilityCity;
	}

	public void setFacilityCity(String facilityCity) {
		this.facilityCity = facilityCity;
	}

	@Column(name = "facility_state", length = 20)
	public String getFacilityState() {
		return this.facilityState;
	}

	public void setFacilityState(String facilityState) {
		this.facilityState = facilityState;
	}

	@Column(name = "facility_zip", length = 64)
	public String getFacilityZip() {
		return this.facilityZip;
	}

	public void setFacilityZip(String facilityZip) {
		this.facilityZip = facilityZip;
	}

	@Column(name = "facility_country", length = 64)
	public String getFacilityCountry() {
		return this.facilityCountry;
	}

	public void setFacilityCountry(String facilityCountry) {
		this.facilityCountry = facilityCountry;
	}

	@Column(name = "facility_recruitment_status", length = 60)
	public String getFacilityRecruitmentStatus() {
		return this.facilityRecruitmentStatus;
	}

	public void setFacilityRecruitmentStatus(String facilityRecruitmentStatus) {
		this.facilityRecruitmentStatus = facilityRecruitmentStatus;
	}

	@Column(name = "facility_contact_name")
	public String getFacilityContactName() {
		return this.facilityContactName;
	}

	public void setFacilityContactName(String facilityContactName) {
		this.facilityContactName = facilityContactName;
	}

	@Column(name = "facility_contact_degree")
	public String getFacilityContactDegree() {
		return this.facilityContactDegree;
	}

	public void setFacilityContactDegree(String facilityContactDegree) {
		this.facilityContactDegree = facilityContactDegree;
	}

	@Column(name = "facility_contact_phone")
	public String getFacilityContactPhone() {
		return this.facilityContactPhone;
	}

	public void setFacilityContactPhone(String facilityContactPhone) {
		this.facilityContactPhone = facilityContactPhone;
	}

	@Column(name = "facility_contact_email")
	public String getFacilityContactEmail() {
		return this.facilityContactEmail;
	}

	public void setFacilityContactEmail(String facilityContactEmail) {
		this.facilityContactEmail = facilityContactEmail;
	}

	@Column(name = "protocol_type", length = 30)
	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
	}

	@Column(name = "protocol_description", length = 1000)
	public String getProtocolDescription() {
		return this.protocolDescription;
	}

	public void setProtocolDescription(String protocolDescription) {
		this.protocolDescription = protocolDescription;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "protocol_date_verification", length = 4)
	public Date getProtocolDateVerification() {
		return this.protocolDateVerification;
	}

	public void setProtocolDateVerification(Date protocolDateVerification) {
		this.protocolDateVerification = protocolDateVerification;
	}

	@Column(name = "phase", length = 30)
	public String getPhase() {
		return this.phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	@Column(name = "expected_total_enrollment")
	public Integer getExpectedTotalEnrollment() {
		return this.expectedTotalEnrollment;
	}

	public void setExpectedTotalEnrollment(Integer expectedTotalEnrollment) {
		this.expectedTotalEnrollment = expectedTotalEnrollment;
	}

	@Column(name = "sponsor")
	public String getSponsor() {
		return this.sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	@Column(name = "collaborators", length = 1000)
	public String getCollaborators() {
		return this.collaborators;
	}

	public void setCollaborators(String collaborators) {
		this.collaborators = collaborators;
	}

	@Column(name = "medline_identifier")
	public String getMedlineIdentifier() {
		return this.medlineIdentifier;
	}

	public void setMedlineIdentifier(String medlineIdentifier) {
		this.medlineIdentifier = medlineIdentifier;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "url_description")
	public String getUrlDescription() {
		return this.urlDescription;
	}

	public void setUrlDescription(String urlDescription) {
		this.urlDescription = urlDescription;
	}

	@Column(name = "conditions", length = 500)
	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	@Column(name = "keywords")
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	@Column(name = "eligibility", length = 500)
	public String getEligibility() {
		return this.eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	@Column(name = "gender", length = 30)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "age_max", length = 3)
	public String getAgeMax() {
		return this.ageMax;
	}

	public void setAgeMax(String ageMax) {
		this.ageMax = ageMax;
	}

	@Column(name = "age_min", length = 3)
	public String getAgeMin() {
		return this.ageMin;
	}

	public void setAgeMin(String ageMin) {
		this.ageMin = ageMin;
	}

	@Column(name = "healthy_volunteer_accepted")
	public Boolean getHealthyVolunteerAccepted() {
		return this.healthyVolunteerAccepted;
	}

	public void setHealthyVolunteerAccepted(Boolean healthyVolunteerAccepted) {
		this.healthyVolunteerAccepted = healthyVolunteerAccepted;
	}

	@Column(name = "purpose", length = 64)
	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Column(name = "allocation", length = 64)
	public String getAllocation() {
		return this.allocation;
	}

	public void setAllocation(String allocation) {
		this.allocation = allocation;
	}

	@Column(name = "masking", length = 30)
	public String getMasking() {
		return this.masking;
	}

	public void setMasking(String masking) {
		this.masking = masking;
	}

	@Column(name = "control", length = 30)
	public String getControl() {
		return this.control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	@Column(name = "assignment", length = 30)
	public String getAssignment() {
		return this.assignment;
	}

	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}

	@Column(name = "endpoint", length = 64)
	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	@Column(name = "interventions", length = 1000)
	public String getInterventions() {
		return this.interventions;
	}

	public void setInterventions(String interventions) {
		this.interventions = interventions;
	}

	@Column(name = "duration", length = 30)
	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Column(name = "selection", length = 30)
	public String getSelection() {
		return this.selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}

	@Column(name = "timing", length = 30)
	public String getTiming() {
		return this.timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	@Column(name = "official_title")
	public String getOfficialTitle() {
		return this.officialTitle;
	}

	public void setOfficialTitle(String officialTitle) {
		this.officialTitle = officialTitle;
	}

	@Column(name = "results_reference")
	public Boolean getResultsReference() {
		return this.resultsReference;
	}

	public void setResultsReference(Boolean resultsReference) {
		this.resultsReference = resultsReference;
	}
	
	@Column(name = "oc_oid", unique = true, nullable = false, length = 40)
	public String getOc_Oid() {
		return this.oc_oid;
	}

	public void setOc_Oid(String ocOid) {
		this.oc_oid = ocOid;
	}

	@Column(name = "old_status_id")
	public Integer getOldStatusId() {
		return this.oldStatusId;
	}

	public void setOldStatusId(Integer oldStatusId) {
		this.oldStatusId = oldStatusId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "study")
	public List<CrfBean> getCrfs() {
		return this.crfs;
	}

	public void setCrfs(List<CrfBean> crfs) {
		this.crfs = crfs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "study")
	public List<StudyEventDefinition> getStudyEventDefinitions() {
		return this.studyEventDefinitions;
	}

	public void setStudyEventDefinitions(List<StudyEventDefinition> studyEventDefinitions) {
		this.studyEventDefinitions = studyEventDefinitions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "study")
	public List<Study> getStudies() {
		return this.studies;
	}

	public void setStudies(List<Study> studies) {
		this.studies = studies;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "study")
	public List<StudyUserRole> getStudyUserRoles() {
		return this.studyUserRoles;
	}

	public void setStudyUserRoles(List<StudyUserRole> studyUserRoles) {
		this.studyUserRoles = studyUserRoles;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "study")
	public Set getDatasets() {
		return this.datasets;
	}

	public void setDatasets(Set datasets) {
		this.datasets = datasets;
	}*/

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "study")
	public List<StudyParameterValue> getStudyParameterValues() {
		return this.studyParameterValues;
	}

	public void setStudyParameterValues(List<StudyParameterValue> studyParameterValues) {
		this.studyParameterValues = studyParameterValues;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "study")
	public List<StudySubject> getStudySubjects() {
		return this.studySubjects;
	}

	public void setStudySubjects(List<StudySubject> studySubjects) {
		this.studySubjects = studySubjects;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "study")
	public List<EventDefinitionCrf> getEventDefinitionCrfs() {
		return this.eventDefinitionCrfs;
	}

	public void setEventDefinitionCrfs( List<EventDefinitionCrf> eventDefinitionCrfs) {
		this.eventDefinitionCrfs = eventDefinitionCrfs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "study")
	public List<DiscrepancyNote> getDiscrepancyNotes() {
		return this.discrepancyNotes;
	}

	public void setDiscrepancyNotes(List<DiscrepancyNote> discrepancyNotes) {
		this.discrepancyNotes = discrepancyNotes;
	}

	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "study")
	public List<StudyModuleStatus> getStudyModuleStatuses() {
		return this.studyModuleStatuses;
	}

	public void setStudyModuleStatuses(List<StudyModuleStatus> studyModuleStatuses) {
		this.studyModuleStatuses = studyModuleStatuses;
	}

	
}
