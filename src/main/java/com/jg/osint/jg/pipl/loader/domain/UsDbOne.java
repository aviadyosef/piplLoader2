package com.jg.osint.jg.pipl.loader.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A UsDbOne.
 */
@Entity
@Table(name = "us_db_one")
public class UsDbOne implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "id_us_db_one")
    private String idUsDbOne;

    @Column(name = "first_name_01")
    private String firstName01;

    @Column(name = "alphafirstname_sort")
    private String alphafirstnameSort;

    @Column(name = "phonetic_first_name")
    private String phoneticFirstName;

    @Column(name = "last_name_01_varchar")
    private String lastName01Varchar;

    @Column(name = "alphalastname_sort")
    private String alphalastnameSort;

    @Column(name = "phonetic_last_name")
    private String phoneticLastName;

    @Column(name = "address")
    private String address;

    @Column(name = "alphaaddress_sort")
    private String alphaaddressSort;

    @Column(name = "city")
    private String city;

    @Column(name = "city_phrase")
    private String cityPhrase;

    @Column(name = "alphacity_sort")
    private String alphacitySort;

    @Column(name = "cities")
    private String cities;

    @Column(name = "state")
    private String state;

    @Column(name = "alphastate_sort")
    private String alphastateSort;

    @Column(name = "zip")
    private String zip;

    @Column(name = "zip_4")
    private String zip4;

    @Column(name = "carrier_route")
    private String carrierRoute;

    @Column(name = "delivery_point")
    private String deliveryPoint;

    @Column(name = "mail_score_code")
    private String mailScoreCode;

    @Column(name = "geo_level_code")
    private String geoLevelCode;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "time_zone_code")
    private String timeZoneCode;

    @Column(name = "county_code")
    private String countyCode;

    @Column(name = "county_description")
    private String countyDescription;

    @Column(name = "cbsa_code")
    private String cbsaCode;

    @Column(name = "cbsa_description")
    private String cbsaDescription;

    @Column(name = "scrubbed_phoneable_flag")
    private String scrubbedPhoneableFlag;

    @Column(name = "ind_gender_code")
    private String indGenderCode;

    @Column(name = "ind_household_rank_code")
    private String indHouseholdRankCode;

    @Column(name = "ind_ethnic_code")
    private String indEthnicCode;

    @Column(name = "ind_political_party_code")
    private String indPoliticalPartyCode;

    @Column(name = "home_value_code")
    private String homeValueCode;

    @Column(name = "home_value_description")
    private String homeValueDescription;

    @Column(name = "home_median_value_code")
    private String homeMedianValueCode;

    @Column(name = "home_median_value_description")
    private String homeMedianValueDescription;

    @Column(name = "median_income_code")
    private String medianIncomeCode;

    @Column(name = "median_income_description")
    private String medianIncomeDescription;

    @Column(name = "income_code")
    private String incomeCode;

    @Column(name = "income_description")
    private String incomeDescription;

    @Column(name = "donor_capacity_code")
    private String donorCapacityCode;

    @Column(name = "delivery_point_checkdigit")
    private String deliveryPointCheckdigit;

    @Column(name = "address_number")
    private String addressNumber;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "street_suffix")
    private String streetSuffix;

    @Column(name = "state_city")
    private String stateCity;

    @Column(name = "address_id")
    private String addressId;

    @Column(name = "po_flag")
    private String poFlag;

    @Column(name = "mailable_flag")
    private String mailableFlag;

    @Column(name = "location_unique_flag")
    private String locationUniqueFlag;

    @Column(name = "productiondate")
    private String productiondate;

    @Column(name = "lat_long")
    private String latLong;

    @Column(name = "geo_lat_long")
    private String geoLatLong;

    @Column(name = "marketing")
    private String marketing;

    @Column(name = "mailable")
    private String mailable;

    @Column(name = "phoneable")
    private String phoneable;

    @Column(name = "mailable_phoneable")
    private String mailablePhoneable;

    @Column(name = "zip_9")
    private String zip9;

    @Column(name = "zip_11")
    private String zip11;

    @Column(name = "zip_4_exists")
    private String zip4exists;

    @Column(name = "address_master")
    private String addressMaster;

    @Column(name = "ls_green_living_flag")
    private String lsGreenLivingFlag;

    @Column(name = "version_num")
    private String versionNum;

    @Column(name = "lat_long_0_coordinate")
    private String latLong0Coordinate;

    @Column(name = "lat_long_1_coordinate")
    private String latLong1Coordinate;

    @Column(name = "pre_direction")
    private String preDirection;

    @Column(name = "home_dwelling_type_code")
    private String homeDwellingTypeCode;

    @Column(name = "secondary_name")
    private String secondaryName;

    @Column(name = "secondary_number")
    private String secondaryNumber;

    @Column(name = "post_direction")
    private String postDirection;

    @Column(name = "number_of_bedrooms")
    private String numberOfBedrooms;

    @Column(name = "number_of_bathrooms")
    private String numberOfBathrooms;

    @Column(name = "home_property_type_code_02")
    private String homePropertyTypeCode02;

    @Column(name = "home_square_footage")
    private String homeSquareFootage;

    @Column(name = "home_square_footage_code")
    private String homeSquareFootageCode;

    @Column(name = "email_present_flag")
    private String emailPresentFlag;

    @Column(name = "email")
    private String email;

    @Column(name = "email_02")
    private String email02;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public UsDbOne id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdUsDbOne() {
        return this.idUsDbOne;
    }

    public UsDbOne idUsDbOne(String idUsDbOne) {
        this.setIdUsDbOne(idUsDbOne);
        return this;
    }

    public void setIdUsDbOne(String idUsDbOne) {
        this.idUsDbOne = idUsDbOne;
    }

    public String getFirstName01() {
        return this.firstName01;
    }

    public UsDbOne firstName01(String firstName01) {
        this.setFirstName01(firstName01);
        return this;
    }

    public void setFirstName01(String firstName01) {
        this.firstName01 = firstName01;
    }

    public String getAlphafirstnameSort() {
        return this.alphafirstnameSort;
    }

    public UsDbOne alphafirstnameSort(String alphafirstnameSort) {
        this.setAlphafirstnameSort(alphafirstnameSort);
        return this;
    }

    public void setAlphafirstnameSort(String alphafirstnameSort) {
        this.alphafirstnameSort = alphafirstnameSort;
    }

    public String getPhoneticFirstName() {
        return this.phoneticFirstName;
    }

    public UsDbOne phoneticFirstName(String phoneticFirstName) {
        this.setPhoneticFirstName(phoneticFirstName);
        return this;
    }

    public void setPhoneticFirstName(String phoneticFirstName) {
        this.phoneticFirstName = phoneticFirstName;
    }

    public String getLastName01Varchar() {
        return this.lastName01Varchar;
    }

    public UsDbOne lastName01Varchar(String lastName01Varchar) {
        this.setLastName01Varchar(lastName01Varchar);
        return this;
    }

    public void setLastName01Varchar(String lastName01Varchar) {
        this.lastName01Varchar = lastName01Varchar;
    }

    public String getAlphalastnameSort() {
        return this.alphalastnameSort;
    }

    public UsDbOne alphalastnameSort(String alphalastnameSort) {
        this.setAlphalastnameSort(alphalastnameSort);
        return this;
    }

    public void setAlphalastnameSort(String alphalastnameSort) {
        this.alphalastnameSort = alphalastnameSort;
    }

    public String getPhoneticLastName() {
        return this.phoneticLastName;
    }

    public UsDbOne phoneticLastName(String phoneticLastName) {
        this.setPhoneticLastName(phoneticLastName);
        return this;
    }

    public void setPhoneticLastName(String phoneticLastName) {
        this.phoneticLastName = phoneticLastName;
    }

    public String getAddress() {
        return this.address;
    }

    public UsDbOne address(String address) {
        this.setAddress(address);
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAlphaaddressSort() {
        return this.alphaaddressSort;
    }

    public UsDbOne alphaaddressSort(String alphaaddressSort) {
        this.setAlphaaddressSort(alphaaddressSort);
        return this;
    }

    public void setAlphaaddressSort(String alphaaddressSort) {
        this.alphaaddressSort = alphaaddressSort;
    }

    public String getCity() {
        return this.city;
    }

    public UsDbOne city(String city) {
        this.setCity(city);
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityPhrase() {
        return this.cityPhrase;
    }

    public UsDbOne cityPhrase(String cityPhrase) {
        this.setCityPhrase(cityPhrase);
        return this;
    }

    public void setCityPhrase(String cityPhrase) {
        this.cityPhrase = cityPhrase;
    }

    public String getAlphacitySort() {
        return this.alphacitySort;
    }

    public UsDbOne alphacitySort(String alphacitySort) {
        this.setAlphacitySort(alphacitySort);
        return this;
    }

    public void setAlphacitySort(String alphacitySort) {
        this.alphacitySort = alphacitySort;
    }

    public String getCities() {
        return this.cities;
    }

    public UsDbOne cities(String cities) {
        this.setCities(cities);
        return this;
    }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public String getState() {
        return this.state;
    }

    public UsDbOne state(String state) {
        this.setState(state);
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAlphastateSort() {
        return this.alphastateSort;
    }

    public UsDbOne alphastateSort(String alphastateSort) {
        this.setAlphastateSort(alphastateSort);
        return this;
    }

    public void setAlphastateSort(String alphastateSort) {
        this.alphastateSort = alphastateSort;
    }

    public String getZip() {
        return this.zip;
    }

    public UsDbOne zip(String zip) {
        this.setZip(zip);
        return this;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip4() {
        return this.zip4;
    }

    public UsDbOne zip4(String zip4) {
        this.setZip4(zip4);
        return this;
    }

    public void setZip4(String zip4) {
        this.zip4 = zip4;
    }

    public String getCarrierRoute() {
        return this.carrierRoute;
    }

    public UsDbOne carrierRoute(String carrierRoute) {
        this.setCarrierRoute(carrierRoute);
        return this;
    }

    public void setCarrierRoute(String carrierRoute) {
        this.carrierRoute = carrierRoute;
    }

    public String getDeliveryPoint() {
        return this.deliveryPoint;
    }

    public UsDbOne deliveryPoint(String deliveryPoint) {
        this.setDeliveryPoint(deliveryPoint);
        return this;
    }

    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public String getMailScoreCode() {
        return this.mailScoreCode;
    }

    public UsDbOne mailScoreCode(String mailScoreCode) {
        this.setMailScoreCode(mailScoreCode);
        return this;
    }

    public void setMailScoreCode(String mailScoreCode) {
        this.mailScoreCode = mailScoreCode;
    }

    public String getGeoLevelCode() {
        return this.geoLevelCode;
    }

    public UsDbOne geoLevelCode(String geoLevelCode) {
        this.setGeoLevelCode(geoLevelCode);
        return this;
    }

    public void setGeoLevelCode(String geoLevelCode) {
        this.geoLevelCode = geoLevelCode;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public UsDbOne latitude(String latitude) {
        this.setLatitude(latitude);
        return this;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public UsDbOne longitude(String longitude) {
        this.setLongitude(longitude);
        return this;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTimeZoneCode() {
        return this.timeZoneCode;
    }

    public UsDbOne timeZoneCode(String timeZoneCode) {
        this.setTimeZoneCode(timeZoneCode);
        return this;
    }

    public void setTimeZoneCode(String timeZoneCode) {
        this.timeZoneCode = timeZoneCode;
    }

    public String getCountyCode() {
        return this.countyCode;
    }

    public UsDbOne countyCode(String countyCode) {
        this.setCountyCode(countyCode);
        return this;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyDescription() {
        return this.countyDescription;
    }

    public UsDbOne countyDescription(String countyDescription) {
        this.setCountyDescription(countyDescription);
        return this;
    }

    public void setCountyDescription(String countyDescription) {
        this.countyDescription = countyDescription;
    }

    public String getCbsaCode() {
        return this.cbsaCode;
    }

    public UsDbOne cbsaCode(String cbsaCode) {
        this.setCbsaCode(cbsaCode);
        return this;
    }

    public void setCbsaCode(String cbsaCode) {
        this.cbsaCode = cbsaCode;
    }

    public String getCbsaDescription() {
        return this.cbsaDescription;
    }

    public UsDbOne cbsaDescription(String cbsaDescription) {
        this.setCbsaDescription(cbsaDescription);
        return this;
    }

    public void setCbsaDescription(String cbsaDescription) {
        this.cbsaDescription = cbsaDescription;
    }

    public String getScrubbedPhoneableFlag() {
        return this.scrubbedPhoneableFlag;
    }

    public UsDbOne scrubbedPhoneableFlag(String scrubbedPhoneableFlag) {
        this.setScrubbedPhoneableFlag(scrubbedPhoneableFlag);
        return this;
    }

    public void setScrubbedPhoneableFlag(String scrubbedPhoneableFlag) {
        this.scrubbedPhoneableFlag = scrubbedPhoneableFlag;
    }

    public String getIndGenderCode() {
        return this.indGenderCode;
    }

    public UsDbOne indGenderCode(String indGenderCode) {
        this.setIndGenderCode(indGenderCode);
        return this;
    }

    public void setIndGenderCode(String indGenderCode) {
        this.indGenderCode = indGenderCode;
    }

    public String getIndHouseholdRankCode() {
        return this.indHouseholdRankCode;
    }

    public UsDbOne indHouseholdRankCode(String indHouseholdRankCode) {
        this.setIndHouseholdRankCode(indHouseholdRankCode);
        return this;
    }

    public void setIndHouseholdRankCode(String indHouseholdRankCode) {
        this.indHouseholdRankCode = indHouseholdRankCode;
    }

    public String getIndEthnicCode() {
        return this.indEthnicCode;
    }

    public UsDbOne indEthnicCode(String indEthnicCode) {
        this.setIndEthnicCode(indEthnicCode);
        return this;
    }

    public void setIndEthnicCode(String indEthnicCode) {
        this.indEthnicCode = indEthnicCode;
    }

    public String getIndPoliticalPartyCode() {
        return this.indPoliticalPartyCode;
    }

    public UsDbOne indPoliticalPartyCode(String indPoliticalPartyCode) {
        this.setIndPoliticalPartyCode(indPoliticalPartyCode);
        return this;
    }

    public void setIndPoliticalPartyCode(String indPoliticalPartyCode) {
        this.indPoliticalPartyCode = indPoliticalPartyCode;
    }

    public String getHomeValueCode() {
        return this.homeValueCode;
    }

    public UsDbOne homeValueCode(String homeValueCode) {
        this.setHomeValueCode(homeValueCode);
        return this;
    }

    public void setHomeValueCode(String homeValueCode) {
        this.homeValueCode = homeValueCode;
    }

    public String getHomeValueDescription() {
        return this.homeValueDescription;
    }

    public UsDbOne homeValueDescription(String homeValueDescription) {
        this.setHomeValueDescription(homeValueDescription);
        return this;
    }

    public void setHomeValueDescription(String homeValueDescription) {
        this.homeValueDescription = homeValueDescription;
    }

    public String getHomeMedianValueCode() {
        return this.homeMedianValueCode;
    }

    public UsDbOne homeMedianValueCode(String homeMedianValueCode) {
        this.setHomeMedianValueCode(homeMedianValueCode);
        return this;
    }

    public void setHomeMedianValueCode(String homeMedianValueCode) {
        this.homeMedianValueCode = homeMedianValueCode;
    }

    public String getHomeMedianValueDescription() {
        return this.homeMedianValueDescription;
    }

    public UsDbOne homeMedianValueDescription(String homeMedianValueDescription) {
        this.setHomeMedianValueDescription(homeMedianValueDescription);
        return this;
    }

    public void setHomeMedianValueDescription(String homeMedianValueDescription) {
        this.homeMedianValueDescription = homeMedianValueDescription;
    }

    public String getMedianIncomeCode() {
        return this.medianIncomeCode;
    }

    public UsDbOne medianIncomeCode(String medianIncomeCode) {
        this.setMedianIncomeCode(medianIncomeCode);
        return this;
    }

    public void setMedianIncomeCode(String medianIncomeCode) {
        this.medianIncomeCode = medianIncomeCode;
    }

    public String getMedianIncomeDescription() {
        return this.medianIncomeDescription;
    }

    public UsDbOne medianIncomeDescription(String medianIncomeDescription) {
        this.setMedianIncomeDescription(medianIncomeDescription);
        return this;
    }

    public void setMedianIncomeDescription(String medianIncomeDescription) {
        this.medianIncomeDescription = medianIncomeDescription;
    }

    public String getIncomeCode() {
        return this.incomeCode;
    }

    public UsDbOne incomeCode(String incomeCode) {
        this.setIncomeCode(incomeCode);
        return this;
    }

    public void setIncomeCode(String incomeCode) {
        this.incomeCode = incomeCode;
    }

    public String getIncomeDescription() {
        return this.incomeDescription;
    }

    public UsDbOne incomeDescription(String incomeDescription) {
        this.setIncomeDescription(incomeDescription);
        return this;
    }

    public void setIncomeDescription(String incomeDescription) {
        this.incomeDescription = incomeDescription;
    }

    public String getDonorCapacityCode() {
        return this.donorCapacityCode;
    }

    public UsDbOne donorCapacityCode(String donorCapacityCode) {
        this.setDonorCapacityCode(donorCapacityCode);
        return this;
    }

    public void setDonorCapacityCode(String donorCapacityCode) {
        this.donorCapacityCode = donorCapacityCode;
    }

    public String getDeliveryPointCheckdigit() {
        return this.deliveryPointCheckdigit;
    }

    public UsDbOne deliveryPointCheckdigit(String deliveryPointCheckdigit) {
        this.setDeliveryPointCheckdigit(deliveryPointCheckdigit);
        return this;
    }

    public void setDeliveryPointCheckdigit(String deliveryPointCheckdigit) {
        this.deliveryPointCheckdigit = deliveryPointCheckdigit;
    }

    public String getAddressNumber() {
        return this.addressNumber;
    }

    public UsDbOne addressNumber(String addressNumber) {
        this.setAddressNumber(addressNumber);
        return this;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public UsDbOne streetName(String streetName) {
        this.setStreetName(streetName);
        return this;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetSuffix() {
        return this.streetSuffix;
    }

    public UsDbOne streetSuffix(String streetSuffix) {
        this.setStreetSuffix(streetSuffix);
        return this;
    }

    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    public String getStateCity() {
        return this.stateCity;
    }

    public UsDbOne stateCity(String stateCity) {
        this.setStateCity(stateCity);
        return this;
    }

    public void setStateCity(String stateCity) {
        this.stateCity = stateCity;
    }

    public String getAddressId() {
        return this.addressId;
    }

    public UsDbOne addressId(String addressId) {
        this.setAddressId(addressId);
        return this;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getPoFlag() {
        return this.poFlag;
    }

    public UsDbOne poFlag(String poFlag) {
        this.setPoFlag(poFlag);
        return this;
    }

    public void setPoFlag(String poFlag) {
        this.poFlag = poFlag;
    }

    public String getMailableFlag() {
        return this.mailableFlag;
    }

    public UsDbOne mailableFlag(String mailableFlag) {
        this.setMailableFlag(mailableFlag);
        return this;
    }

    public void setMailableFlag(String mailableFlag) {
        this.mailableFlag = mailableFlag;
    }

    public String getLocationUniqueFlag() {
        return this.locationUniqueFlag;
    }

    public UsDbOne locationUniqueFlag(String locationUniqueFlag) {
        this.setLocationUniqueFlag(locationUniqueFlag);
        return this;
    }

    public void setLocationUniqueFlag(String locationUniqueFlag) {
        this.locationUniqueFlag = locationUniqueFlag;
    }

    public String getProductiondate() {
        return this.productiondate;
    }

    public UsDbOne productiondate(String productiondate) {
        this.setProductiondate(productiondate);
        return this;
    }

    public void setProductiondate(String productiondate) {
        this.productiondate = productiondate;
    }

    public String getLatLong() {
        return this.latLong;
    }

    public UsDbOne latLong(String latLong) {
        this.setLatLong(latLong);
        return this;
    }

    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }

    public String getGeoLatLong() {
        return this.geoLatLong;
    }

    public UsDbOne geoLatLong(String geoLatLong) {
        this.setGeoLatLong(geoLatLong);
        return this;
    }

    public void setGeoLatLong(String geoLatLong) {
        this.geoLatLong = geoLatLong;
    }

    public String getMarketing() {
        return this.marketing;
    }

    public UsDbOne marketing(String marketing) {
        this.setMarketing(marketing);
        return this;
    }

    public void setMarketing(String marketing) {
        this.marketing = marketing;
    }

    public String getMailable() {
        return this.mailable;
    }

    public UsDbOne mailable(String mailable) {
        this.setMailable(mailable);
        return this;
    }

    public void setMailable(String mailable) {
        this.mailable = mailable;
    }

    public String getPhoneable() {
        return this.phoneable;
    }

    public UsDbOne phoneable(String phoneable) {
        this.setPhoneable(phoneable);
        return this;
    }

    public void setPhoneable(String phoneable) {
        this.phoneable = phoneable;
    }

    public String getMailablePhoneable() {
        return this.mailablePhoneable;
    }

    public UsDbOne mailablePhoneable(String mailablePhoneable) {
        this.setMailablePhoneable(mailablePhoneable);
        return this;
    }

    public void setMailablePhoneable(String mailablePhoneable) {
        this.mailablePhoneable = mailablePhoneable;
    }

    public String getZip9() {
        return this.zip9;
    }

    public UsDbOne zip9(String zip9) {
        this.setZip9(zip9);
        return this;
    }

    public void setZip9(String zip9) {
        this.zip9 = zip9;
    }

    public String getZip11() {
        return this.zip11;
    }

    public UsDbOne zip11(String zip11) {
        this.setZip11(zip11);
        return this;
    }

    public void setZip11(String zip11) {
        this.zip11 = zip11;
    }

    public String getZip4exists() {
        return this.zip4exists;
    }

    public UsDbOne zip4exists(String zip4exists) {
        this.setZip4exists(zip4exists);
        return this;
    }

    public void setZip4exists(String zip4exists) {
        this.zip4exists = zip4exists;
    }

    public String getAddressMaster() {
        return this.addressMaster;
    }

    public UsDbOne addressMaster(String addressMaster) {
        this.setAddressMaster(addressMaster);
        return this;
    }

    public void setAddressMaster(String addressMaster) {
        this.addressMaster = addressMaster;
    }

    public String getLsGreenLivingFlag() {
        return this.lsGreenLivingFlag;
    }

    public UsDbOne lsGreenLivingFlag(String lsGreenLivingFlag) {
        this.setLsGreenLivingFlag(lsGreenLivingFlag);
        return this;
    }

    public void setLsGreenLivingFlag(String lsGreenLivingFlag) {
        this.lsGreenLivingFlag = lsGreenLivingFlag;
    }

    public String getVersionNum() {
        return this.versionNum;
    }

    public UsDbOne versionNum(String versionNum) {
        this.setVersionNum(versionNum);
        return this;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public String getLatLong0Coordinate() {
        return this.latLong0Coordinate;
    }

    public UsDbOne latLong0Coordinate(String latLong0Coordinate) {
        this.setLatLong0Coordinate(latLong0Coordinate);
        return this;
    }

    public void setLatLong0Coordinate(String latLong0Coordinate) {
        this.latLong0Coordinate = latLong0Coordinate;
    }

    public String getLatLong1Coordinate() {
        return this.latLong1Coordinate;
    }

    public UsDbOne latLong1Coordinate(String latLong1Coordinate) {
        this.setLatLong1Coordinate(latLong1Coordinate);
        return this;
    }

    public void setLatLong1Coordinate(String latLong1Coordinate) {
        this.latLong1Coordinate = latLong1Coordinate;
    }

    public String getPreDirection() {
        return this.preDirection;
    }

    public UsDbOne preDirection(String preDirection) {
        this.setPreDirection(preDirection);
        return this;
    }

    public void setPreDirection(String preDirection) {
        this.preDirection = preDirection;
    }

    public String getHomeDwellingTypeCode() {
        return this.homeDwellingTypeCode;
    }

    public UsDbOne homeDwellingTypeCode(String homeDwellingTypeCode) {
        this.setHomeDwellingTypeCode(homeDwellingTypeCode);
        return this;
    }

    public void setHomeDwellingTypeCode(String homeDwellingTypeCode) {
        this.homeDwellingTypeCode = homeDwellingTypeCode;
    }

    public String getSecondaryName() {
        return this.secondaryName;
    }

    public UsDbOne secondaryName(String secondaryName) {
        this.setSecondaryName(secondaryName);
        return this;
    }

    public void setSecondaryName(String secondaryName) {
        this.secondaryName = secondaryName;
    }

    public String getSecondaryNumber() {
        return this.secondaryNumber;
    }

    public UsDbOne secondaryNumber(String secondaryNumber) {
        this.setSecondaryNumber(secondaryNumber);
        return this;
    }

    public void setSecondaryNumber(String secondaryNumber) {
        this.secondaryNumber = secondaryNumber;
    }

    public String getPostDirection() {
        return this.postDirection;
    }

    public UsDbOne postDirection(String postDirection) {
        this.setPostDirection(postDirection);
        return this;
    }

    public void setPostDirection(String postDirection) {
        this.postDirection = postDirection;
    }

    public String getNumberOfBedrooms() {
        return this.numberOfBedrooms;
    }

    public UsDbOne numberOfBedrooms(String numberOfBedrooms) {
        this.setNumberOfBedrooms(numberOfBedrooms);
        return this;
    }

    public void setNumberOfBedrooms(String numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public String getNumberOfBathrooms() {
        return this.numberOfBathrooms;
    }

    public UsDbOne numberOfBathrooms(String numberOfBathrooms) {
        this.setNumberOfBathrooms(numberOfBathrooms);
        return this;
    }

    public void setNumberOfBathrooms(String numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public String getHomePropertyTypeCode02() {
        return this.homePropertyTypeCode02;
    }

    public UsDbOne homePropertyTypeCode02(String homePropertyTypeCode02) {
        this.setHomePropertyTypeCode02(homePropertyTypeCode02);
        return this;
    }

    public void setHomePropertyTypeCode02(String homePropertyTypeCode02) {
        this.homePropertyTypeCode02 = homePropertyTypeCode02;
    }

    public String getHomeSquareFootage() {
        return this.homeSquareFootage;
    }

    public UsDbOne homeSquareFootage(String homeSquareFootage) {
        this.setHomeSquareFootage(homeSquareFootage);
        return this;
    }

    public void setHomeSquareFootage(String homeSquareFootage) {
        this.homeSquareFootage = homeSquareFootage;
    }

    public String getHomeSquareFootageCode() {
        return this.homeSquareFootageCode;
    }

    public UsDbOne homeSquareFootageCode(String homeSquareFootageCode) {
        this.setHomeSquareFootageCode(homeSquareFootageCode);
        return this;
    }

    public void setHomeSquareFootageCode(String homeSquareFootageCode) {
        this.homeSquareFootageCode = homeSquareFootageCode;
    }

    public String getEmailPresentFlag() {
        return this.emailPresentFlag;
    }

    public UsDbOne emailPresentFlag(String emailPresentFlag) {
        this.setEmailPresentFlag(emailPresentFlag);
        return this;
    }

    public void setEmailPresentFlag(String emailPresentFlag) {
        this.emailPresentFlag = emailPresentFlag;
    }

    public String getEmail() {
        return this.email;
    }

    public UsDbOne email(String email) {
        this.setEmail(email);
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail02() {
        return this.email02;
    }

    public UsDbOne email02(String email02) {
        this.setEmail02(email02);
        return this;
    }

    public void setEmail02(String email02) {
        this.email02 = email02;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsDbOne)) {
            return false;
        }
        return id != null && id.equals(((UsDbOne) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UsDbOne{" +
            "id=" + getId() +
            ", idUsDbOne='" + getIdUsDbOne() + "'" +
            ", firstName01='" + getFirstName01() + "'" +
            ", alphafirstnameSort='" + getAlphafirstnameSort() + "'" +
            ", phoneticFirstName='" + getPhoneticFirstName() + "'" +
            ", lastName01Varchar='" + getLastName01Varchar() + "'" +
            ", alphalastnameSort='" + getAlphalastnameSort() + "'" +
            ", phoneticLastName='" + getPhoneticLastName() + "'" +
            ", address='" + getAddress() + "'" +
            ", alphaaddressSort='" + getAlphaaddressSort() + "'" +
            ", city='" + getCity() + "'" +
            ", cityPhrase='" + getCityPhrase() + "'" +
            ", alphacitySort='" + getAlphacitySort() + "'" +
            ", cities='" + getCities() + "'" +
            ", state='" + getState() + "'" +
            ", alphastateSort='" + getAlphastateSort() + "'" +
            ", zip='" + getZip() + "'" +
            ", zip4='" + getZip4() + "'" +
            ", carrierRoute='" + getCarrierRoute() + "'" +
            ", deliveryPoint='" + getDeliveryPoint() + "'" +
            ", mailScoreCode='" + getMailScoreCode() + "'" +
            ", geoLevelCode='" + getGeoLevelCode() + "'" +
            ", latitude='" + getLatitude() + "'" +
            ", longitude='" + getLongitude() + "'" +
            ", timeZoneCode='" + getTimeZoneCode() + "'" +
            ", countyCode='" + getCountyCode() + "'" +
            ", countyDescription='" + getCountyDescription() + "'" +
            ", cbsaCode='" + getCbsaCode() + "'" +
            ", cbsaDescription='" + getCbsaDescription() + "'" +
            ", scrubbedPhoneableFlag='" + getScrubbedPhoneableFlag() + "'" +
            ", indGenderCode='" + getIndGenderCode() + "'" +
            ", indHouseholdRankCode='" + getIndHouseholdRankCode() + "'" +
            ", indEthnicCode='" + getIndEthnicCode() + "'" +
            ", indPoliticalPartyCode='" + getIndPoliticalPartyCode() + "'" +
            ", homeValueCode='" + getHomeValueCode() + "'" +
            ", homeValueDescription='" + getHomeValueDescription() + "'" +
            ", homeMedianValueCode='" + getHomeMedianValueCode() + "'" +
            ", homeMedianValueDescription='" + getHomeMedianValueDescription() + "'" +
            ", medianIncomeCode='" + getMedianIncomeCode() + "'" +
            ", medianIncomeDescription='" + getMedianIncomeDescription() + "'" +
            ", incomeCode='" + getIncomeCode() + "'" +
            ", incomeDescription='" + getIncomeDescription() + "'" +
            ", donorCapacityCode='" + getDonorCapacityCode() + "'" +
            ", deliveryPointCheckdigit='" + getDeliveryPointCheckdigit() + "'" +
            ", addressNumber='" + getAddressNumber() + "'" +
            ", streetName='" + getStreetName() + "'" +
            ", streetSuffix='" + getStreetSuffix() + "'" +
            ", stateCity='" + getStateCity() + "'" +
            ", addressId='" + getAddressId() + "'" +
            ", poFlag='" + getPoFlag() + "'" +
            ", mailableFlag='" + getMailableFlag() + "'" +
            ", locationUniqueFlag='" + getLocationUniqueFlag() + "'" +
            ", productiondate='" + getProductiondate() + "'" +
            ", latLong='" + getLatLong() + "'" +
            ", geoLatLong='" + getGeoLatLong() + "'" +
            ", marketing='" + getMarketing() + "'" +
            ", mailable='" + getMailable() + "'" +
            ", phoneable='" + getPhoneable() + "'" +
            ", mailablePhoneable='" + getMailablePhoneable() + "'" +
            ", zip9='" + getZip9() + "'" +
            ", zip11='" + getZip11() + "'" +
            ", zip4exists='" + getZip4exists() + "'" +
            ", addressMaster='" + getAddressMaster() + "'" +
            ", lsGreenLivingFlag='" + getLsGreenLivingFlag() + "'" +
            ", versionNum='" + getVersionNum() + "'" +
            ", latLong0Coordinate='" + getLatLong0Coordinate() + "'" +
            ", latLong1Coordinate='" + getLatLong1Coordinate() + "'" +
            ", preDirection='" + getPreDirection() + "'" +
            ", homeDwellingTypeCode='" + getHomeDwellingTypeCode() + "'" +
            ", secondaryName='" + getSecondaryName() + "'" +
            ", secondaryNumber='" + getSecondaryNumber() + "'" +
            ", postDirection='" + getPostDirection() + "'" +
            ", numberOfBedrooms='" + getNumberOfBedrooms() + "'" +
            ", numberOfBathrooms='" + getNumberOfBathrooms() + "'" +
            ", homePropertyTypeCode02='" + getHomePropertyTypeCode02() + "'" +
            ", homeSquareFootage='" + getHomeSquareFootage() + "'" +
            ", homeSquareFootageCode='" + getHomeSquareFootageCode() + "'" +
            ", emailPresentFlag='" + getEmailPresentFlag() + "'" +
            ", email='" + getEmail() + "'" +
            ", email02='" + getEmail02() + "'" +
            "}";
    }
}
