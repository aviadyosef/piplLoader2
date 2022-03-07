package com.jg.osint.jg.pipl.loader.domain.csv;

import java.io.Serializable;

/**
 * A PiplPerson.
 */
public class PersonUsDbCsv implements Serializable {

/* row index=0 */    private String HHID;
/* row index=1 */    private String ID;
/* row index=2 */    private String FirstName01;
/* row index=3 */    private String alphafirstnamesort;
/* row index=4 */    private String PhoneticFirstName;
/* row index=5 */    private String MiddleName01;
/* row index=6 */    private String LastName01;
/* row index=7 */    private String alphalastnamesort;
/* row index=8 */    private String PhoneticLastName;
/* row index=9 */    private String Address;
/* row index=10 */    private String alphaaddresssort;
/* row index=11 */    private String City;
/* row index=12 */    private String CITYPHRASE;
/* row index=13 */    private String alphacitysort;
/* row index=14 */    private String Cities;
/* row index=15 */    private String State;
/* row index=16 */    private String alphastatesort;
/* row index=17 */    private String ZIP;
/* row index=18 */    private String ZIP4;
/* row index=19 */    private String CarrierRoute;
/* row index=20 */    private String DeliveryPoint;
/* row index=21 */    private String MailScoreCode;
/* row index=22 */    private String geoLevelCode;
/* row index=23 */    private String Latitude;
/* row index=24 */    private String Longitude;
/* row index=25 */    private String timeZoneCode;
/* row index=26 */    private String countyCode;
/* row index=27 */    private String countyDescription;
/* row index=28 */    private String cBSACode;
/* row index=29 */    private String cBSADescription;
/* row index=30 */    private String scrubbedPhoneableFlag;
/* row index=31 */    private String indGenderCode;
/* row index=32 */    private String indDateOfBirthYear;
/* row index=33 */    private String indDateOfBirthMonth;
/* row index=34 */    private String indAge;
/* row index=35 */    private String indOccupationCode;
/* row index=36 */    private String indHouseholdRankCode;
/* row index=37 */    private String indEthnicCode;
/* row index=38 */    private String indPoliticalPartyCode;
/* row index=39 */    private String homeValueCode;
/* row index=40 */    private String homeValueDescription;
/* row index=41 */    private String homeMedianValueCode;
/* row index=42 */    private String homeMedianValueDescription;
/* row index=43 */    private String homeOwnerRenterCode;
/* row index=44 */    private String homePurchaseDate;
/* row index=45 */    private String homePurchaseYear;
/* row index=46 */    private String lengthOfResidenceCode;
/* row index=47 */    private String homeBuiltYear;
/* row index=48 */    private String homeBuiltYearCode;
/* row index=49 */    private String homeBuiltYearDescription;
/* row index=50 */    private String homeDwellingTypeCode;
/* row index=51 */    private String medianIncomeCode;
/* row index=52 */    private String medianIncomeDescription;
/* row index=53 */    private String incomeCode;
/* row index=54 */    private String incomeDescription;
/* row index=55 */    private String netWorthCode;
/* row index=56 */    private String creditCapacity;
/* row index=57 */    private String creditCapacityCode;
/* row index=58 */    private String creditCapacityDescription;
/* row index=59 */    private String cCUserFlag;
/* row index=60 */    private String creditCardMailOrderBuyers;
/* row index=61 */    private String cCBankFlag;
/* row index=62 */    private String cCUnknownFlag;
/* row index=63 */    private String cCPremiumFlag;
/* row index=64 */    private String donorCapacityCode;
/* row index=65 */    private String charitableFlag;
/* row index=66 */    private String donor;
/* row index=67 */    private String childrensFlag;
/* row index=68 */    private String religiousFlag;
/* row index=69 */    private String numberChildrenCode;
/* row index=70 */    private String maritalStatusCode;
/* row index=71 */    private String veteranPresentHHFlag;
/* row index=72 */    private String entTheaterPerformingArtsFlag;
/* row index=73 */    private String artsHistoryScience;
/* row index=74 */    private String entSweepstakesContestsFlag;
/* row index=75 */    private String investingFinance;
/* row index=76 */    private String readingGeneralFlag;
/* row index=77 */    private String reading;
/* row index=78 */    private String readingReligiousInspirationalFlag;
/* row index=79 */    private String readingScienceFictionFlag;
/* row index=80 */    private String readingMagazinesFlag;
/* row index=81 */    private String investmentsPersonalFlag;
/* row index=82 */    private String investmentsStocksBondsFlag;
/* row index=83 */    private String travelDomesticFlag;
/* row index=84 */    private String travel;
/* row index=85 */    private String travelInternationalFlag;
/* row index=86 */    private String travelRVFlag;
/* row index=87 */    private String travelCruisesFlag;
/* row index=88 */    private String musicPlayerFlag;
/* row index=89 */    private String movieMusic;
/* row index=90 */    private String selfExerciseWalkingFlag;
/* row index=91 */    private String healthandFitness;
/* row index=92 */    private String selfExerciseAerobicFlag;
/* row index=93 */    private String selfDietingWeightLossFlag;
/* row index=94 */    private String collectiblesGeneralFlag;
/* row index=95 */    private String collectiblesAndAntiques;
/* row index=96 */    private String collectiblesCoinsFlag;
/* row index=97 */    private String hobbiesAutoWorkFlag;
/* row index=98 */    private String hobbyInterest;
/* row index=99 */    private String hobbiesCraftsFlag;
/* row index=100 */    private String hobbiesWoodworkingFlag;
/* row index=101 */    private String hobbiesGardeningFlag;
/* row index=102 */    private String homeImprovement;
/* row index=103 */    private String homeFurnishingsDecoratingFlag;
/* row index=104 */    private String outdoorFishingFlag;
/* row index=105 */    private String outdoorEnthusiast;
/* row index=106 */    private String outdoorHuntingShootingFlag;
/* row index=107 */    private String outdoorBoatingSailingFlag;
/* row index=108 */    private String spectatorSportsFootballFlag;
/* row index=109 */    private String sports;
/* row index=110 */    private String spectatorSportsBaseballFlag;
/* row index=111 */    private String spectatorSportsTVSportsFlag;
/* row index=112 */    private String sportsGolfFlag;
/* row index=113 */    private String sportsSkiingFlag;
/* row index=114 */    private String environmentalIssuesFlag;
/* row index=115 */    private String grandchildrenFlag;
/* row index=116 */    private String familyReligionPolitics;
/* row index=117 */    private String otherPetOwnerFlag;
/* row index=118 */    private String animalsPets;
/* row index=119 */    private String mailOrderBuyerFlag;
/* row index=120 */    private String mailOrderResponderFlag;
/* row index=121 */    private String pCOwnerFlag;
/* row index=122 */    private String computersElectronics;
/* row index=123 */    private String consumerElectronicsFlag;
/* row index=124 */    private String lSHomeLivingFlag;
/* row index=125 */    private String lSSportyLivingFlag;
/* row index=126 */    private String lSUpscaleLivingFlag;
/* row index=127 */    private String lSHighbrowLivingFlag;
/* row index=128 */    private String lSCommonLivingFlag;
/* row index=129 */    private String lSBroaderLivingFlag;
/* row index=130 */    private String deliveryPointCheckDigit;
/* row index=131 */    private String addressNumber;
/* row index=132 */    private String streetName;
/* row index=133 */    private String streetSuffix;
/* row index=134 */    private String stateCity;
/* row index=135 */    private String addressID;
/* row index=136 */    private String pOFlag;
/* row index=137 */    private String mailableFlag;
/* row index=138 */    private String locationUniqueFlag;
/* row index=139 */    private String cellPhone;
/* row index=140 */    private String mostRecentHomePurchaseDateFlag;
/* row index=141 */    private String productionDate;
/* row index=142 */    private String indAgeCode;
/* row index=143 */    private String latLong;
/* row index=144 */    private String geoLatLong;
/* row index=145 */    private String marketing;
/* row index=146 */    private String mailable;
/* row index=147 */    private String phoneable;
/* row index=148 */    private String mailablePhoneable;
/* row index=149 */    private String zIP9;
/* row index=150 */    private String zip11;
/* row index=151 */    private String zip4Exists;
/* row index=152 */    private String addressMaster;
/* row index=153 */    private String lSGreenLivingFlag;
/* row index=154 */    private String version;
/* row index=155 */    private String latLong0coordinate;
/* row index=156 */    private String latLong1coordinate;
/* row index=157 */    private String emailPresentFlag;
/* row index=158 */    private String email;
/* row index=159 */    private String homeSquareFootage;
/* row index=160 */    private String homeSquareFootageCode;
/* row index=161 */    private String animalWelfareFlag;
/* row index=162 */    private String healthFlag;
/* row index=163 */    private String internationalAidFlag;
/* row index=164 */    private String politicalFlag;
/* row index=165 */    private String politicalAffiliationDonor;
/* row index=166 */    private String politicalConservativeFlag;
/* row index=167 */    private String veteransFlag;
/* row index=168 */    private String foodsNaturalFlag;
/* row index=169 */    private String cookingFood;
/* row index=170 */    private String musicListenerFlag;
/* row index=171 */    private String selfExerciseRunningJoggingFlag;
/* row index=172 */    private String selfHealthMedicalFlag;
/* row index=173 */    private String selfImprovementFlag;
/* row index=174 */    private String careerSelfImprovement;
/* row index=175 */    private String selfCareerImprovementFlag;
/* row index=176 */    private String collectorAvidFlag;
/* row index=177 */    private String hobbiesSewingKnittingNeedleworkFlag;
/* row index=178 */    private String spectatorSportsBasketballFlag;
/* row index=179 */    private String sportsCollectiblesMemorabiliaFlag;
/* row index=180 */    private String currentAffairsPoliticsFlag;
/* row index=181 */    private String vehicleOwnedCode;
/* row index=182 */    private String catOwnerFlag;
/* row index=183 */    private String lSProfessionalLivingFlag;
/* row index=184 */    private String email01MD5;
/* row index=185 */    private String numberofBedrooms;
/* row index=186 */    private String numberofBathrooms;
/* row index=187 */    private String cCGasDeptRetailFlag;
/* row index=188 */    private String cCUpscaleDeptFlag;
/* row index=189*/    private String mailOrderDonorFlag;
/* row index=190 */    private String cookingGeneralFlag;
/* row index=191 */    private String cookingGourmetFlag;
/* row index=192 */    private String collectiblesArtsFlag;
/* row index=193 */    private String collectiblesAntiquesFlag;
/* row index=194 */    private String beautyCosmeticsFlag;
/* row index=195 */    private String beautyFashion;
/* row index=196 */    private String childrensInterestsFlag;
/* row index=197 */    private String areaCode;
/* row index=198 */    private String phone;
/* row index=199 */    private String dNCFlag;
/* row index=200 */    private String artsCulturalFlag;
/* row index=200 */    private String entArtsFlag;
/* row index=201 */    private String hobbiesHistoryMilitaryFlag;
/* row index=202 */    private String hobbiesPhotographyFlag;
/* row index=203 */    private String religiousInspirationalFlag;
/* row index=204 */    private String dogOwnerFlag;
/* row index=205 */    private String christianFamilyFlag;
/* row index=206 */    private String homePropertyTypeCode02;
/* row index=207 */    private String homeEquityAvailableCode;
/* row index=208 */    private String homeEquityAvailableDescription;
/* row index=209 */    private String readingFinancialNewsletterFlag;
/* row index=210 */    private String investmentsRealEstateFlag;
/* row index=211 */    private String musicCollectorFlag;
/* row index=212 */    private String movieCollectorFlag;
/* row index=213 */    private String readingAudioBooksFlag;
/* row index=214 */    private String foodWinesFlag;
/* row index=215 */    private String hobbiesGamesBoardPuzzlesFlag;
/* row index=216 */    private String computerAndVideoGamesPuzzles;
/* row index=217 */    private String spectatorSportsHockeyFlag;
/* row index=218 */    private String spectatorSportsNASCARFlag;
/* row index=219 */    private String gamesVideoGamesFlag;
/* row index=220 */    private String smokingTobaccoFlag;
/* row index=221 */    private String ailments;
/* row index=222 */    private String childrenPresentFlag;
/* row index=223 */    private String secondaryName;
/* row index=224 */    private String secondaryNumber;
/* row index=225 */    private String parentingFlag;
/* row index=226 */    private String sportsMotorcyclingFlag;
/* row index=227 */    private String homeImprovementDIYFlag;
/* row index=228 */    private String lSDIYLivingFlag;
/* row index=229 */    private String cCTravelEntertainmentFlag;
/* row index=230 */    private String outdoorCampingHikingFlag;
/* row index=231 */    private String collectiblesStampsFlag;
/* row index=232 */    private String tVSatelliteDishFlag;
/* row index=233 */    private String email02;
/* row index=234 */    private String email03;
/* row index=235 */    private String email04;
/* row index=236 */    private String email02MD5;
/* row index=237 */    private String email03MD5;
/* row index=238 */    private String email04MD5;
/* row index=239 */    private String recentlyMovedFlag;
/* row index=240 */    private String recentlyMovedYear;
/* row index=241 */    private String recentlyMovedMonth;
/* row index=242 */    private String moneySeekersFlag;
/* row index=243 */    private String email05;
/* row index=244 */    private String email05MD5;
/* row index=245 */    private String spectatorSportsRacingFlag;
/* row index=246 */    private String sportsTennisFlag;
/* row index=247 */    private String selfEducationOnlineFlag;
/* row index=248 */    private String hobbiesAviationFlag;
/* row index=249 */    private String gamesComputerGamesFlag;
/* row index=250 */    private String veteranPresentIndFlag;
/* row index=251 */    private String homeLoanToValueCode;
/* row index=252 */    private String entGamingCasinoFlag;
/* row index=253 */    private String walkSequence;
/* row index=254 */    private String preDirection;
/* row index=255 */    private String investmentsForeignFlag;
/* row index=256 */    private String hobbiesScienceSpaceFlag;
/* row index=257 */    private String ailmentArthritisFlag;
/* row index=258 */    private String ailmentDiabeticFlag;
/* row index=259 */    private String ailmentOrthopedicFlag;
/* row index=260 */    private String outdoorScubaDivingFlag;
/* row index=261 */    private String postDirection;
/* row index=262 */    private String sportsEquestrianFlag;
/* row index=263 */    private String musicHomeStereoFlag;
/* row index=264 */    private String truckOwnerFlag;
/* row index=265 */    private String motorVehicles;
/* row index=266 */    private String politicalLiberalFlag;
/* row index=267 */    private String environmentWildlifeFlag;
/* row index=268 */    private String hobbiesHousePlantFlag;
/* row index=269 */    private String rVOwnerFlag;
/* row index=270 */    private String city2;
/* row index=271 */    private String stateCity2;
/* row index=272 */    private String spectatorSportsSoccerFlag;
/* row index=273 */    private String ailmentSeniorFlag;
/* row index=274 */    private String motorcycleOwnerFlag;
/* row index=275 */    private String ailmentAllergyFlag;
/* row index=276 */    private String newHomeHHID;
/* row index=277 */    private String newHomeOwnerFlag;
/* row index=278 */    private String boatOwnerFlag;
/* row index=279 */    private String ailmentDisabledFlagOwnerFlag;
/* row index=280 */    private String ailmentDisabledFlag;

    public String getHHID() {
        return HHID;
    }

    public void setHHID(String HHID) {
        this.HHID = HHID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName01() {
        return FirstName01;
    }

    public void setFirstName01(String firstName01) {
        FirstName01 = firstName01;
    }

    public String getAlphafirstnamesort() {
        return alphafirstnamesort;
    }

    public void setAlphafirstnamesort(String alphafirstnamesort) {
        this.alphafirstnamesort = alphafirstnamesort;
    }

    public String getPhoneticFirstName() {
        return PhoneticFirstName;
    }

    public void setPhoneticFirstName(String phoneticFirstName) {
        PhoneticFirstName = phoneticFirstName;
    }

    public String getMiddleName01() {
        return MiddleName01;
    }

    public void setMiddleName01(String middleName01) {
        MiddleName01 = middleName01;
    }

    public String getLastName01() {
        return LastName01;
    }

    public void setLastName01(String lastName01) {
        LastName01 = lastName01;
    }

    public String getAlphalastnamesort() {
        return alphalastnamesort;
    }

    public void setAlphalastnamesort(String alphalastnamesort) {
        this.alphalastnamesort = alphalastnamesort;
    }

    public String getPhoneticLastName() {
        return PhoneticLastName;
    }

    public void setPhoneticLastName(String phoneticLastName) {
        PhoneticLastName = phoneticLastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAlphaaddresssort() {
        return alphaaddresssort;
    }

    public void setAlphaaddresssort(String alphaaddresssort) {
        this.alphaaddresssort = alphaaddresssort;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCITYPHRASE() {
        return CITYPHRASE;
    }

    public void setCITYPHRASE(String CITYPHRASE) {
        this.CITYPHRASE = CITYPHRASE;
    }

    public String getAlphacitysort() {
        return alphacitysort;
    }

    public void setAlphacitysort(String alphacitysort) {
        this.alphacitysort = alphacitysort;
    }

    public String getCities() {
        return Cities;
    }

    public void setCities(String cities) {
        Cities = cities;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getAlphastatesort() {
        return alphastatesort;
    }

    public void setAlphastatesort(String alphastatesort) {
        this.alphastatesort = alphastatesort;
    }

    public String getZIP() {
        return ZIP;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }

    public String getZIP4() {
        return ZIP4;
    }

    public void setZIP4(String ZIP4) {
        this.ZIP4 = ZIP4;
    }

    public String getCarrierRoute() {
        return CarrierRoute;
    }

    public void setCarrierRoute(String carrierRoute) {
        CarrierRoute = carrierRoute;
    }

    public String getDeliveryPoint() {
        return DeliveryPoint;
    }

    public void setDeliveryPoint(String deliveryPoint) {
        DeliveryPoint = deliveryPoint;
    }

    public String getMailScoreCode() {
        return MailScoreCode;
    }

    public void setMailScoreCode(String mailScoreCode) {
        MailScoreCode = mailScoreCode;
    }

    public String getGeoLevelCode() {
        return geoLevelCode;
    }

    public void setGeoLevelCode(String geoLevelCode) {
        this.geoLevelCode = geoLevelCode;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getTimeZoneCode() {
        return timeZoneCode;
    }

    public void setTimeZoneCode(String timeZoneCode) {
        this.timeZoneCode = timeZoneCode;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyDescription() {
        return countyDescription;
    }

    public void setCountyDescription(String countyDescription) {
        this.countyDescription = countyDescription;
    }

    public String getcBSACode() {
        return cBSACode;
    }

    public void setcBSACode(String cBSACode) {
        this.cBSACode = cBSACode;
    }

    public String getcBSADescription() {
        return cBSADescription;
    }

    public void setcBSADescription(String cBSADescription) {
        this.cBSADescription = cBSADescription;
    }

    public String getScrubbedPhoneableFlag() {
        return scrubbedPhoneableFlag;
    }

    public void setScrubbedPhoneableFlag(String scrubbedPhoneableFlag) {
        this.scrubbedPhoneableFlag = scrubbedPhoneableFlag;
    }

    public String getIndGenderCode() {
        return indGenderCode;
    }

    public void setIndGenderCode(String indGenderCode) {
        this.indGenderCode = indGenderCode;
    }

    public String getIndDateOfBirthYear() {
        return indDateOfBirthYear;
    }

    public void setIndDateOfBirthYear(String indDateOfBirthYear) {
        this.indDateOfBirthYear = indDateOfBirthYear;
    }

    public String getIndDateOfBirthMonth() {
        return indDateOfBirthMonth;
    }

    public void setIndDateOfBirthMonth(String indDateOfBirthMonth) {
        this.indDateOfBirthMonth = indDateOfBirthMonth;
    }

    public String getIndAge() {
        return indAge;
    }

    public void setIndAge(String indAge) {
        this.indAge = indAge;
    }

    public String getIndOccupationCode() {
        return indOccupationCode;
    }

    public void setIndOccupationCode(String indOccupationCode) {
        this.indOccupationCode = indOccupationCode;
    }

    public String getIndHouseholdRankCode() {
        return indHouseholdRankCode;
    }

    public void setIndHouseholdRankCode(String indHouseholdRankCode) {
        this.indHouseholdRankCode = indHouseholdRankCode;
    }

    public String getIndEthnicCode() {
        return indEthnicCode;
    }

    public void setIndEthnicCode(String indEthnicCode) {
        this.indEthnicCode = indEthnicCode;
    }

    public String getIndPoliticalPartyCode() {
        return indPoliticalPartyCode;
    }

    public void setIndPoliticalPartyCode(String indPoliticalPartyCode) {
        this.indPoliticalPartyCode = indPoliticalPartyCode;
    }

    public String getHomeValueCode() {
        return homeValueCode;
    }

    public void setHomeValueCode(String homeValueCode) {
        this.homeValueCode = homeValueCode;
    }

    public String getHomeValueDescription() {
        return homeValueDescription;
    }

    public void setHomeValueDescription(String homeValueDescription) {
        this.homeValueDescription = homeValueDescription;
    }

    public String getHomeMedianValueCode() {
        return homeMedianValueCode;
    }

    public void setHomeMedianValueCode(String homeMedianValueCode) {
        this.homeMedianValueCode = homeMedianValueCode;
    }

    public String getHomeMedianValueDescription() {
        return homeMedianValueDescription;
    }

    public void setHomeMedianValueDescription(String homeMedianValueDescription) {
        this.homeMedianValueDescription = homeMedianValueDescription;
    }

    public String getHomeOwnerRenterCode() {
        return homeOwnerRenterCode;
    }

    public void setHomeOwnerRenterCode(String homeOwnerRenterCode) {
        this.homeOwnerRenterCode = homeOwnerRenterCode;
    }

    public String getHomePurchaseDate() {
        return homePurchaseDate;
    }

    public void setHomePurchaseDate(String homePurchaseDate) {
        this.homePurchaseDate = homePurchaseDate;
    }

    public String getHomePurchaseYear() {
        return homePurchaseYear;
    }

    public void setHomePurchaseYear(String homePurchaseYear) {
        this.homePurchaseYear = homePurchaseYear;
    }

    public String getLengthOfResidenceCode() {
        return lengthOfResidenceCode;
    }

    public void setLengthOfResidenceCode(String lengthOfResidenceCode) {
        this.lengthOfResidenceCode = lengthOfResidenceCode;
    }

    public String getHomeBuiltYear() {
        return homeBuiltYear;
    }

    public void setHomeBuiltYear(String homeBuiltYear) {
        this.homeBuiltYear = homeBuiltYear;
    }

    public String getHomeBuiltYearCode() {
        return homeBuiltYearCode;
    }

    public void setHomeBuiltYearCode(String homeBuiltYearCode) {
        this.homeBuiltYearCode = homeBuiltYearCode;
    }

    public String getHomeBuiltYearDescription() {
        return homeBuiltYearDescription;
    }

    public void setHomeBuiltYearDescription(String homeBuiltYearDescription) {
        this.homeBuiltYearDescription = homeBuiltYearDescription;
    }

    public String getHomeDwellingTypeCode() {
        return homeDwellingTypeCode;
    }

    public void setHomeDwellingTypeCode(String homeDwellingTypeCode) {
        this.homeDwellingTypeCode = homeDwellingTypeCode;
    }

    public String getMedianIncomeCode() {
        return medianIncomeCode;
    }

    public void setMedianIncomeCode(String medianIncomeCode) {
        this.medianIncomeCode = medianIncomeCode;
    }

    public String getMedianIncomeDescription() {
        return medianIncomeDescription;
    }

    public void setMedianIncomeDescription(String medianIncomeDescription) {
        this.medianIncomeDescription = medianIncomeDescription;
    }

    public String getIncomeCode() {
        return incomeCode;
    }

    public void setIncomeCode(String incomeCode) {
        this.incomeCode = incomeCode;
    }

    public String getIncomeDescription() {
        return incomeDescription;
    }

    public void setIncomeDescription(String incomeDescription) {
        this.incomeDescription = incomeDescription;
    }

    public String getNetWorthCode() {
        return netWorthCode;
    }

    public void setNetWorthCode(String netWorthCode) {
        this.netWorthCode = netWorthCode;
    }

    public String getCreditCapacity() {
        return creditCapacity;
    }

    public void setCreditCapacity(String creditCapacity) {
        this.creditCapacity = creditCapacity;
    }

    public String getCreditCapacityCode() {
        return creditCapacityCode;
    }

    public void setCreditCapacityCode(String creditCapacityCode) {
        this.creditCapacityCode = creditCapacityCode;
    }

    public String getCreditCapacityDescription() {
        return creditCapacityDescription;
    }

    public void setCreditCapacityDescription(String creditCapacityDescription) {
        this.creditCapacityDescription = creditCapacityDescription;
    }

    public String getcCUserFlag() {
        return cCUserFlag;
    }

    public void setcCUserFlag(String cCUserFlag) {
        this.cCUserFlag = cCUserFlag;
    }

    public String getCreditCardMailOrderBuyers() {
        return creditCardMailOrderBuyers;
    }

    public void setCreditCardMailOrderBuyers(String creditCardMailOrderBuyers) {
        this.creditCardMailOrderBuyers = creditCardMailOrderBuyers;
    }

    public String getcCBankFlag() {
        return cCBankFlag;
    }

    public void setcCBankFlag(String cCBankFlag) {
        this.cCBankFlag = cCBankFlag;
    }

    public String getcCUnknownFlag() {
        return cCUnknownFlag;
    }

    public void setcCUnknownFlag(String cCUnknownFlag) {
        this.cCUnknownFlag = cCUnknownFlag;
    }

    public String getcCPremiumFlag() {
        return cCPremiumFlag;
    }

    public void setcCPremiumFlag(String cCPremiumFlag) {
        this.cCPremiumFlag = cCPremiumFlag;
    }

    public String getDonorCapacityCode() {
        return donorCapacityCode;
    }

    public void setDonorCapacityCode(String donorCapacityCode) {
        this.donorCapacityCode = donorCapacityCode;
    }

    public String getCharitableFlag() {
        return charitableFlag;
    }

    public void setCharitableFlag(String charitableFlag) {
        this.charitableFlag = charitableFlag;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public String getChildrensFlag() {
        return childrensFlag;
    }

    public void setChildrensFlag(String childrensFlag) {
        this.childrensFlag = childrensFlag;
    }

    public String getReligiousFlag() {
        return religiousFlag;
    }

    public void setReligiousFlag(String religiousFlag) {
        this.religiousFlag = religiousFlag;
    }

    public String getNumberChildrenCode() {
        return numberChildrenCode;
    }

    public void setNumberChildrenCode(String numberChildrenCode) {
        this.numberChildrenCode = numberChildrenCode;
    }

    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(String maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    public String getVeteranPresentHHFlag() {
        return veteranPresentHHFlag;
    }

    public void setVeteranPresentHHFlag(String veteranPresentHHFlag) {
        this.veteranPresentHHFlag = veteranPresentHHFlag;
    }

    public String getEntTheaterPerformingArtsFlag() {
        return entTheaterPerformingArtsFlag;
    }

    public void setEntTheaterPerformingArtsFlag(String entTheaterPerformingArtsFlag) {
        this.entTheaterPerformingArtsFlag = entTheaterPerformingArtsFlag;
    }

    public String getArtsHistoryScience() {
        return artsHistoryScience;
    }

    public void setArtsHistoryScience(String artsHistoryScience) {
        this.artsHistoryScience = artsHistoryScience;
    }

    public String getEntSweepstakesContestsFlag() {
        return entSweepstakesContestsFlag;
    }

    public void setEntSweepstakesContestsFlag(String entSweepstakesContestsFlag) {
        this.entSweepstakesContestsFlag = entSweepstakesContestsFlag;
    }

    public String getInvestingFinance() {
        return investingFinance;
    }

    public void setInvestingFinance(String investingFinance) {
        this.investingFinance = investingFinance;
    }

    public String getReadingGeneralFlag() {
        return readingGeneralFlag;
    }

    public void setReadingGeneralFlag(String readingGeneralFlag) {
        this.readingGeneralFlag = readingGeneralFlag;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }

    public String getReadingReligiousInspirationalFlag() {
        return readingReligiousInspirationalFlag;
    }

    public void setReadingReligiousInspirationalFlag(String readingReligiousInspirationalFlag) {
        this.readingReligiousInspirationalFlag = readingReligiousInspirationalFlag;
    }

    public String getReadingScienceFictionFlag() {
        return readingScienceFictionFlag;
    }

    public void setReadingScienceFictionFlag(String readingScienceFictionFlag) {
        this.readingScienceFictionFlag = readingScienceFictionFlag;
    }

    public String getReadingMagazinesFlag() {
        return readingMagazinesFlag;
    }

    public void setReadingMagazinesFlag(String readingMagazinesFlag) {
        this.readingMagazinesFlag = readingMagazinesFlag;
    }

    public String getInvestmentsPersonalFlag() {
        return investmentsPersonalFlag;
    }

    public void setInvestmentsPersonalFlag(String investmentsPersonalFlag) {
        this.investmentsPersonalFlag = investmentsPersonalFlag;
    }

    public String getInvestmentsStocksBondsFlag() {
        return investmentsStocksBondsFlag;
    }

    public void setInvestmentsStocksBondsFlag(String investmentsStocksBondsFlag) {
        this.investmentsStocksBondsFlag = investmentsStocksBondsFlag;
    }

    public String getTravelDomesticFlag() {
        return travelDomesticFlag;
    }

    public void setTravelDomesticFlag(String travelDomesticFlag) {
        this.travelDomesticFlag = travelDomesticFlag;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String getTravelInternationalFlag() {
        return travelInternationalFlag;
    }

    public void setTravelInternationalFlag(String travelInternationalFlag) {
        this.travelInternationalFlag = travelInternationalFlag;
    }

    public String getTravelRVFlag() {
        return travelRVFlag;
    }

    public void setTravelRVFlag(String travelRVFlag) {
        this.travelRVFlag = travelRVFlag;
    }

    public String getTravelCruisesFlag() {
        return travelCruisesFlag;
    }

    public void setTravelCruisesFlag(String travelCruisesFlag) {
        this.travelCruisesFlag = travelCruisesFlag;
    }

    public String getMusicPlayerFlag() {
        return musicPlayerFlag;
    }

    public void setMusicPlayerFlag(String musicPlayerFlag) {
        this.musicPlayerFlag = musicPlayerFlag;
    }

    public String getMovieMusic() {
        return movieMusic;
    }

    public void setMovieMusic(String movieMusic) {
        this.movieMusic = movieMusic;
    }

    public String getSelfExerciseWalkingFlag() {
        return selfExerciseWalkingFlag;
    }

    public void setSelfExerciseWalkingFlag(String selfExerciseWalkingFlag) {
        this.selfExerciseWalkingFlag = selfExerciseWalkingFlag;
    }

    public String getHealthandFitness() {
        return healthandFitness;
    }

    public void setHealthandFitness(String healthandFitness) {
        this.healthandFitness = healthandFitness;
    }

    public String getSelfExerciseAerobicFlag() {
        return selfExerciseAerobicFlag;
    }

    public void setSelfExerciseAerobicFlag(String selfExerciseAerobicFlag) {
        this.selfExerciseAerobicFlag = selfExerciseAerobicFlag;
    }

    public String getSelfDietingWeightLossFlag() {
        return selfDietingWeightLossFlag;
    }

    public void setSelfDietingWeightLossFlag(String selfDietingWeightLossFlag) {
        this.selfDietingWeightLossFlag = selfDietingWeightLossFlag;
    }

    public String getCollectiblesGeneralFlag() {
        return collectiblesGeneralFlag;
    }

    public void setCollectiblesGeneralFlag(String collectiblesGeneralFlag) {
        this.collectiblesGeneralFlag = collectiblesGeneralFlag;
    }

    public String getCollectiblesAndAntiques() {
        return collectiblesAndAntiques;
    }

    public void setCollectiblesAndAntiques(String collectiblesAndAntiques) {
        this.collectiblesAndAntiques = collectiblesAndAntiques;
    }

    public String getCollectiblesCoinsFlag() {
        return collectiblesCoinsFlag;
    }

    public void setCollectiblesCoinsFlag(String collectiblesCoinsFlag) {
        this.collectiblesCoinsFlag = collectiblesCoinsFlag;
    }

    public String getHobbiesAutoWorkFlag() {
        return hobbiesAutoWorkFlag;
    }

    public void setHobbiesAutoWorkFlag(String hobbiesAutoWorkFlag) {
        this.hobbiesAutoWorkFlag = hobbiesAutoWorkFlag;
    }

    public String getHobbyInterest() {
        return hobbyInterest;
    }

    public void setHobbyInterest(String hobbyInterest) {
        this.hobbyInterest = hobbyInterest;
    }

    public String getHobbiesCraftsFlag() {
        return hobbiesCraftsFlag;
    }

    public void setHobbiesCraftsFlag(String hobbiesCraftsFlag) {
        this.hobbiesCraftsFlag = hobbiesCraftsFlag;
    }

    public String getHobbiesWoodworkingFlag() {
        return hobbiesWoodworkingFlag;
    }

    public void setHobbiesWoodworkingFlag(String hobbiesWoodworkingFlag) {
        this.hobbiesWoodworkingFlag = hobbiesWoodworkingFlag;
    }

    public String getHobbiesGardeningFlag() {
        return hobbiesGardeningFlag;
    }

    public void setHobbiesGardeningFlag(String hobbiesGardeningFlag) {
        this.hobbiesGardeningFlag = hobbiesGardeningFlag;
    }

    public String getHomeImprovement() {
        return homeImprovement;
    }

    public void setHomeImprovement(String homeImprovement) {
        this.homeImprovement = homeImprovement;
    }

    public String getHomeFurnishingsDecoratingFlag() {
        return homeFurnishingsDecoratingFlag;
    }

    public void setHomeFurnishingsDecoratingFlag(String homeFurnishingsDecoratingFlag) {
        this.homeFurnishingsDecoratingFlag = homeFurnishingsDecoratingFlag;
    }

    public String getOutdoorFishingFlag() {
        return outdoorFishingFlag;
    }

    public void setOutdoorFishingFlag(String outdoorFishingFlag) {
        this.outdoorFishingFlag = outdoorFishingFlag;
    }

    public String getOutdoorEnthusiast() {
        return outdoorEnthusiast;
    }

    public void setOutdoorEnthusiast(String outdoorEnthusiast) {
        this.outdoorEnthusiast = outdoorEnthusiast;
    }

    public String getOutdoorHuntingShootingFlag() {
        return outdoorHuntingShootingFlag;
    }

    public void setOutdoorHuntingShootingFlag(String outdoorHuntingShootingFlag) {
        this.outdoorHuntingShootingFlag = outdoorHuntingShootingFlag;
    }

    public String getOutdoorBoatingSailingFlag() {
        return outdoorBoatingSailingFlag;
    }

    public void setOutdoorBoatingSailingFlag(String outdoorBoatingSailingFlag) {
        this.outdoorBoatingSailingFlag = outdoorBoatingSailingFlag;
    }

    public String getSpectatorSportsFootballFlag() {
        return spectatorSportsFootballFlag;
    }

    public void setSpectatorSportsFootballFlag(String spectatorSportsFootballFlag) {
        this.spectatorSportsFootballFlag = spectatorSportsFootballFlag;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getSpectatorSportsBaseballFlag() {
        return spectatorSportsBaseballFlag;
    }

    public void setSpectatorSportsBaseballFlag(String spectatorSportsBaseballFlag) {
        this.spectatorSportsBaseballFlag = spectatorSportsBaseballFlag;
    }

    public String getSpectatorSportsTVSportsFlag() {
        return spectatorSportsTVSportsFlag;
    }

    public void setSpectatorSportsTVSportsFlag(String spectatorSportsTVSportsFlag) {
        this.spectatorSportsTVSportsFlag = spectatorSportsTVSportsFlag;
    }

    public String getSportsGolfFlag() {
        return sportsGolfFlag;
    }

    public void setSportsGolfFlag(String sportsGolfFlag) {
        this.sportsGolfFlag = sportsGolfFlag;
    }

    public String getSportsSkiingFlag() {
        return sportsSkiingFlag;
    }

    public void setSportsSkiingFlag(String sportsSkiingFlag) {
        this.sportsSkiingFlag = sportsSkiingFlag;
    }

    public String getEnvironmentalIssuesFlag() {
        return environmentalIssuesFlag;
    }

    public void setEnvironmentalIssuesFlag(String environmentalIssuesFlag) {
        this.environmentalIssuesFlag = environmentalIssuesFlag;
    }

    public String getGrandchildrenFlag() {
        return grandchildrenFlag;
    }

    public void setGrandchildrenFlag(String grandchildrenFlag) {
        this.grandchildrenFlag = grandchildrenFlag;
    }

    public String getFamilyReligionPolitics() {
        return familyReligionPolitics;
    }

    public void setFamilyReligionPolitics(String familyReligionPolitics) {
        this.familyReligionPolitics = familyReligionPolitics;
    }

    public String getOtherPetOwnerFlag() {
        return otherPetOwnerFlag;
    }

    public void setOtherPetOwnerFlag(String otherPetOwnerFlag) {
        this.otherPetOwnerFlag = otherPetOwnerFlag;
    }

    public String getAnimalsPets() {
        return animalsPets;
    }

    public void setAnimalsPets(String animalsPets) {
        this.animalsPets = animalsPets;
    }

    public String getMailOrderBuyerFlag() {
        return mailOrderBuyerFlag;
    }

    public void setMailOrderBuyerFlag(String mailOrderBuyerFlag) {
        this.mailOrderBuyerFlag = mailOrderBuyerFlag;
    }

    public String getMailOrderResponderFlag() {
        return mailOrderResponderFlag;
    }

    public void setMailOrderResponderFlag(String mailOrderResponderFlag) {
        this.mailOrderResponderFlag = mailOrderResponderFlag;
    }

    public String getpCOwnerFlag() {
        return pCOwnerFlag;
    }

    public void setpCOwnerFlag(String pCOwnerFlag) {
        this.pCOwnerFlag = pCOwnerFlag;
    }

    public String getComputersElectronics() {
        return computersElectronics;
    }

    public void setComputersElectronics(String computersElectronics) {
        this.computersElectronics = computersElectronics;
    }

    public String getConsumerElectronicsFlag() {
        return consumerElectronicsFlag;
    }

    public void setConsumerElectronicsFlag(String consumerElectronicsFlag) {
        this.consumerElectronicsFlag = consumerElectronicsFlag;
    }

    public String getlSHomeLivingFlag() {
        return lSHomeLivingFlag;
    }

    public void setlSHomeLivingFlag(String lSHomeLivingFlag) {
        this.lSHomeLivingFlag = lSHomeLivingFlag;
    }

    public String getlSSportyLivingFlag() {
        return lSSportyLivingFlag;
    }

    public void setlSSportyLivingFlag(String lSSportyLivingFlag) {
        this.lSSportyLivingFlag = lSSportyLivingFlag;
    }

    public String getlSUpscaleLivingFlag() {
        return lSUpscaleLivingFlag;
    }

    public void setlSUpscaleLivingFlag(String lSUpscaleLivingFlag) {
        this.lSUpscaleLivingFlag = lSUpscaleLivingFlag;
    }

    public String getlSHighbrowLivingFlag() {
        return lSHighbrowLivingFlag;
    }

    public void setlSHighbrowLivingFlag(String lSHighbrowLivingFlag) {
        this.lSHighbrowLivingFlag = lSHighbrowLivingFlag;
    }

    public String getlSCommonLivingFlag() {
        return lSCommonLivingFlag;
    }

    public void setlSCommonLivingFlag(String lSCommonLivingFlag) {
        this.lSCommonLivingFlag = lSCommonLivingFlag;
    }

    public String getlSBroaderLivingFlag() {
        return lSBroaderLivingFlag;
    }

    public void setlSBroaderLivingFlag(String lSBroaderLivingFlag) {
        this.lSBroaderLivingFlag = lSBroaderLivingFlag;
    }

    public String getDeliveryPointCheckDigit() {
        return deliveryPointCheckDigit;
    }

    public void setDeliveryPointCheckDigit(String deliveryPointCheckDigit) {
        this.deliveryPointCheckDigit = deliveryPointCheckDigit;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetSuffix() {
        return streetSuffix;
    }

    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    public String getStateCity() {
        return stateCity;
    }

    public void setStateCity(String stateCity) {
        this.stateCity = stateCity;
    }

    public String getAddressID() {
        return addressID;
    }

    public void setAddressID(String addressID) {
        this.addressID = addressID;
    }

    public String getpOFlag() {
        return pOFlag;
    }

    public void setpOFlag(String pOFlag) {
        this.pOFlag = pOFlag;
    }

    public String getMailableFlag() {
        return mailableFlag;
    }

    public void setMailableFlag(String mailableFlag) {
        this.mailableFlag = mailableFlag;
    }

    public String getLocationUniqueFlag() {
        return locationUniqueFlag;
    }

    public void setLocationUniqueFlag(String locationUniqueFlag) {
        this.locationUniqueFlag = locationUniqueFlag;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getMostRecentHomePurchaseDateFlag() {
        return mostRecentHomePurchaseDateFlag;
    }

    public void setMostRecentHomePurchaseDateFlag(String mostRecentHomePurchaseDateFlag) {
        this.mostRecentHomePurchaseDateFlag = mostRecentHomePurchaseDateFlag;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getIndAgeCode() {
        return indAgeCode;
    }

    public void setIndAgeCode(String indAgeCode) {
        this.indAgeCode = indAgeCode;
    }

    public String getLatLong() {
        return latLong;
    }

    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }

    public String getGeoLatLong() {
        return geoLatLong;
    }

    public void setGeoLatLong(String geoLatLong) {
        this.geoLatLong = geoLatLong;
    }

    public String getMarketing() {
        return marketing;
    }

    public void setMarketing(String marketing) {
        this.marketing = marketing;
    }

    public String getMailable() {
        return mailable;
    }

    public void setMailable(String mailable) {
        this.mailable = mailable;
    }

    public String getPhoneable() {
        return phoneable;
    }

    public void setPhoneable(String phoneable) {
        this.phoneable = phoneable;
    }

    public String getMailablePhoneable() {
        return mailablePhoneable;
    }

    public void setMailablePhoneable(String mailablePhoneable) {
        this.mailablePhoneable = mailablePhoneable;
    }

    public String getzIP9() {
        return zIP9;
    }

    public void setzIP9(String zIP9) {
        this.zIP9 = zIP9;
    }

    public String getZip11() {
        return zip11;
    }

    public void setZip11(String zip11) {
        this.zip11 = zip11;
    }

    public String getZip4Exists() {
        return zip4Exists;
    }

    public void setZip4Exists(String zip4Exists) {
        this.zip4Exists = zip4Exists;
    }

    public String getAddressMaster() {
        return addressMaster;
    }

    public void setAddressMaster(String addressMaster) {
        this.addressMaster = addressMaster;
    }

    public String getlSGreenLivingFlag() {
        return lSGreenLivingFlag;
    }

    public void setlSGreenLivingFlag(String lSGreenLivingFlag) {
        this.lSGreenLivingFlag = lSGreenLivingFlag;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLatLong0coordinate() {
        return latLong0coordinate;
    }

    public void setLatLong0coordinate(String latLong0coordinate) {
        this.latLong0coordinate = latLong0coordinate;
    }

    public String getLatLong1coordinate() {
        return latLong1coordinate;
    }

    public void setLatLong1coordinate(String latLong1coordinate) {
        this.latLong1coordinate = latLong1coordinate;
    }

    public String getEmailPresentFlag() {
        return emailPresentFlag;
    }

    public void setEmailPresentFlag(String emailPresentFlag) {
        this.emailPresentFlag = emailPresentFlag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeSquareFootage() {
        return homeSquareFootage;
    }

    public void setHomeSquareFootage(String homeSquareFootage) {
        this.homeSquareFootage = homeSquareFootage;
    }

    public String getHomeSquareFootageCode() {
        return homeSquareFootageCode;
    }

    public void setHomeSquareFootageCode(String homeSquareFootageCode) {
        this.homeSquareFootageCode = homeSquareFootageCode;
    }

    public String getAnimalWelfareFlag() {
        return animalWelfareFlag;
    }

    public void setAnimalWelfareFlag(String animalWelfareFlag) {
        this.animalWelfareFlag = animalWelfareFlag;
    }

    public String getHealthFlag() {
        return healthFlag;
    }

    public void setHealthFlag(String healthFlag) {
        this.healthFlag = healthFlag;
    }

    public String getInternationalAidFlag() {
        return internationalAidFlag;
    }

    public void setInternationalAidFlag(String internationalAidFlag) {
        this.internationalAidFlag = internationalAidFlag;
    }

    public String getPoliticalFlag() {
        return politicalFlag;
    }

    public void setPoliticalFlag(String politicalFlag) {
        this.politicalFlag = politicalFlag;
    }

    public String getPoliticalAffiliationDonor() {
        return politicalAffiliationDonor;
    }

    public void setPoliticalAffiliationDonor(String politicalAffiliationDonor) {
        this.politicalAffiliationDonor = politicalAffiliationDonor;
    }

    public String getPoliticalConservativeFlag() {
        return politicalConservativeFlag;
    }

    public void setPoliticalConservativeFlag(String politicalConservativeFlag) {
        this.politicalConservativeFlag = politicalConservativeFlag;
    }

    public String getVeteransFlag() {
        return veteransFlag;
    }

    public void setVeteransFlag(String veteransFlag) {
        this.veteransFlag = veteransFlag;
    }

    public String getFoodsNaturalFlag() {
        return foodsNaturalFlag;
    }

    public void setFoodsNaturalFlag(String foodsNaturalFlag) {
        this.foodsNaturalFlag = foodsNaturalFlag;
    }

    public String getCookingFood() {
        return cookingFood;
    }

    public void setCookingFood(String cookingFood) {
        this.cookingFood = cookingFood;
    }

    public String getMusicListenerFlag() {
        return musicListenerFlag;
    }

    public void setMusicListenerFlag(String musicListenerFlag) {
        this.musicListenerFlag = musicListenerFlag;
    }

    public String getSelfExerciseRunningJoggingFlag() {
        return selfExerciseRunningJoggingFlag;
    }

    public void setSelfExerciseRunningJoggingFlag(String selfExerciseRunningJoggingFlag) {
        this.selfExerciseRunningJoggingFlag = selfExerciseRunningJoggingFlag;
    }

    public String getSelfHealthMedicalFlag() {
        return selfHealthMedicalFlag;
    }

    public void setSelfHealthMedicalFlag(String selfHealthMedicalFlag) {
        this.selfHealthMedicalFlag = selfHealthMedicalFlag;
    }

    public String getSelfImprovementFlag() {
        return selfImprovementFlag;
    }

    public void setSelfImprovementFlag(String selfImprovementFlag) {
        this.selfImprovementFlag = selfImprovementFlag;
    }

    public String getCareerSelfImprovement() {
        return careerSelfImprovement;
    }

    public void setCareerSelfImprovement(String careerSelfImprovement) {
        this.careerSelfImprovement = careerSelfImprovement;
    }

    public String getSelfCareerImprovementFlag() {
        return selfCareerImprovementFlag;
    }

    public void setSelfCareerImprovementFlag(String selfCareerImprovementFlag) {
        this.selfCareerImprovementFlag = selfCareerImprovementFlag;
    }

    public String getCollectorAvidFlag() {
        return collectorAvidFlag;
    }

    public void setCollectorAvidFlag(String collectorAvidFlag) {
        this.collectorAvidFlag = collectorAvidFlag;
    }

    public String getHobbiesSewingKnittingNeedleworkFlag() {
        return hobbiesSewingKnittingNeedleworkFlag;
    }

    public void setHobbiesSewingKnittingNeedleworkFlag(String hobbiesSewingKnittingNeedleworkFlag) {
        this.hobbiesSewingKnittingNeedleworkFlag = hobbiesSewingKnittingNeedleworkFlag;
    }

    public String getSpectatorSportsBasketballFlag() {
        return spectatorSportsBasketballFlag;
    }

    public void setSpectatorSportsBasketballFlag(String spectatorSportsBasketballFlag) {
        this.spectatorSportsBasketballFlag = spectatorSportsBasketballFlag;
    }

    public String getSportsCollectiblesMemorabiliaFlag() {
        return sportsCollectiblesMemorabiliaFlag;
    }

    public void setSportsCollectiblesMemorabiliaFlag(String sportsCollectiblesMemorabiliaFlag) {
        this.sportsCollectiblesMemorabiliaFlag = sportsCollectiblesMemorabiliaFlag;
    }

    public String getCurrentAffairsPoliticsFlag() {
        return currentAffairsPoliticsFlag;
    }

    public void setCurrentAffairsPoliticsFlag(String currentAffairsPoliticsFlag) {
        this.currentAffairsPoliticsFlag = currentAffairsPoliticsFlag;
    }

    public String getVehicleOwnedCode() {
        return vehicleOwnedCode;
    }

    public void setVehicleOwnedCode(String vehicleOwnedCode) {
        this.vehicleOwnedCode = vehicleOwnedCode;
    }

    public String getCatOwnerFlag() {
        return catOwnerFlag;
    }

    public void setCatOwnerFlag(String catOwnerFlag) {
        this.catOwnerFlag = catOwnerFlag;
    }

    public String getlSProfessionalLivingFlag() {
        return lSProfessionalLivingFlag;
    }

    public void setlSProfessionalLivingFlag(String lSProfessionalLivingFlag) {
        this.lSProfessionalLivingFlag = lSProfessionalLivingFlag;
    }

    public String getEmail01MD5() {
        return email01MD5;
    }

    public void setEmail01MD5(String email01MD5) {
        this.email01MD5 = email01MD5;
    }

    public String getNumberofBedrooms() {
        return numberofBedrooms;
    }

    public void setNumberofBedrooms(String numberofBedrooms) {
        this.numberofBedrooms = numberofBedrooms;
    }

    public String getNumberofBathrooms() {
        return numberofBathrooms;
    }

    public void setNumberofBathrooms(String numberofBathrooms) {
        this.numberofBathrooms = numberofBathrooms;
    }

    public String getcCGasDeptRetailFlag() {
        return cCGasDeptRetailFlag;
    }

    public void setcCGasDeptRetailFlag(String cCGasDeptRetailFlag) {
        this.cCGasDeptRetailFlag = cCGasDeptRetailFlag;
    }

    public String getcCUpscaleDeptFlag() {
        return cCUpscaleDeptFlag;
    }

    public void setcCUpscaleDeptFlag(String cCUpscaleDeptFlag) {
        this.cCUpscaleDeptFlag = cCUpscaleDeptFlag;
    }

    public String getMailOrderDonorFlag() {
        return mailOrderDonorFlag;
    }

    public void setMailOrderDonorFlag(String mailOrderDonorFlag) {
        this.mailOrderDonorFlag = mailOrderDonorFlag;
    }

    public String getCookingGeneralFlag() {
        return cookingGeneralFlag;
    }

    public void setCookingGeneralFlag(String cookingGeneralFlag) {
        this.cookingGeneralFlag = cookingGeneralFlag;
    }

    public String getCookingGourmetFlag() {
        return cookingGourmetFlag;
    }

    public void setCookingGourmetFlag(String cookingGourmetFlag) {
        this.cookingGourmetFlag = cookingGourmetFlag;
    }

    public String getCollectiblesArtsFlag() {
        return collectiblesArtsFlag;
    }

    public void setCollectiblesArtsFlag(String collectiblesArtsFlag) {
        this.collectiblesArtsFlag = collectiblesArtsFlag;
    }

    public String getCollectiblesAntiquesFlag() {
        return collectiblesAntiquesFlag;
    }

    public void setCollectiblesAntiquesFlag(String collectiblesAntiquesFlag) {
        this.collectiblesAntiquesFlag = collectiblesAntiquesFlag;
    }

    public String getBeautyCosmeticsFlag() {
        return beautyCosmeticsFlag;
    }

    public void setBeautyCosmeticsFlag(String beautyCosmeticsFlag) {
        this.beautyCosmeticsFlag = beautyCosmeticsFlag;
    }

    public String getBeautyFashion() {
        return beautyFashion;
    }

    public void setBeautyFashion(String beautyFashion) {
        this.beautyFashion = beautyFashion;
    }

    public String getChildrensInterestsFlag() {
        return childrensInterestsFlag;
    }

    public void setChildrensInterestsFlag(String childrensInterestsFlag) {
        this.childrensInterestsFlag = childrensInterestsFlag;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getdNCFlag() {
        return dNCFlag;
    }

    public void setdNCFlag(String dNCFlag) {
        this.dNCFlag = dNCFlag;
    }

    public String getArtsCulturalFlag() {
        return artsCulturalFlag;
    }

    public void setArtsCulturalFlag(String artsCulturalFlag) {
        this.artsCulturalFlag = artsCulturalFlag;
    }

    public String getEntArtsFlag() {
        return entArtsFlag;
    }

    public void setEntArtsFlag(String entArtsFlag) {
        this.entArtsFlag = entArtsFlag;
    }

    public String getHobbiesHistoryMilitaryFlag() {
        return hobbiesHistoryMilitaryFlag;
    }

    public void setHobbiesHistoryMilitaryFlag(String hobbiesHistoryMilitaryFlag) {
        this.hobbiesHistoryMilitaryFlag = hobbiesHistoryMilitaryFlag;
    }

    public String getHobbiesPhotographyFlag() {
        return hobbiesPhotographyFlag;
    }

    public void setHobbiesPhotographyFlag(String hobbiesPhotographyFlag) {
        this.hobbiesPhotographyFlag = hobbiesPhotographyFlag;
    }

    public String getReligiousInspirationalFlag() {
        return religiousInspirationalFlag;
    }

    public void setReligiousInspirationalFlag(String religiousInspirationalFlag) {
        this.religiousInspirationalFlag = religiousInspirationalFlag;
    }

    public String getDogOwnerFlag() {
        return dogOwnerFlag;
    }

    public void setDogOwnerFlag(String dogOwnerFlag) {
        this.dogOwnerFlag = dogOwnerFlag;
    }

    public String getChristianFamilyFlag() {
        return christianFamilyFlag;
    }

    public void setChristianFamilyFlag(String christianFamilyFlag) {
        this.christianFamilyFlag = christianFamilyFlag;
    }

    public String getHomePropertyTypeCode02() {
        return homePropertyTypeCode02;
    }

    public void setHomePropertyTypeCode02(String homePropertyTypeCode02) {
        this.homePropertyTypeCode02 = homePropertyTypeCode02;
    }

    public String getHomeEquityAvailableCode() {
        return homeEquityAvailableCode;
    }

    public void setHomeEquityAvailableCode(String homeEquityAvailableCode) {
        this.homeEquityAvailableCode = homeEquityAvailableCode;
    }

    public String getHomeEquityAvailableDescription() {
        return homeEquityAvailableDescription;
    }

    public void setHomeEquityAvailableDescription(String homeEquityAvailableDescription) {
        this.homeEquityAvailableDescription = homeEquityAvailableDescription;
    }

    public String getReadingFinancialNewsletterFlag() {
        return readingFinancialNewsletterFlag;
    }

    public void setReadingFinancialNewsletterFlag(String readingFinancialNewsletterFlag) {
        this.readingFinancialNewsletterFlag = readingFinancialNewsletterFlag;
    }

    public String getInvestmentsRealEstateFlag() {
        return investmentsRealEstateFlag;
    }

    public void setInvestmentsRealEstateFlag(String investmentsRealEstateFlag) {
        this.investmentsRealEstateFlag = investmentsRealEstateFlag;
    }

    public String getMusicCollectorFlag() {
        return musicCollectorFlag;
    }

    public void setMusicCollectorFlag(String musicCollectorFlag) {
        this.musicCollectorFlag = musicCollectorFlag;
    }

    public String getMovieCollectorFlag() {
        return movieCollectorFlag;
    }

    public void setMovieCollectorFlag(String movieCollectorFlag) {
        this.movieCollectorFlag = movieCollectorFlag;
    }

    public String getReadingAudioBooksFlag() {
        return readingAudioBooksFlag;
    }

    public void setReadingAudioBooksFlag(String readingAudioBooksFlag) {
        this.readingAudioBooksFlag = readingAudioBooksFlag;
    }

    public String getFoodWinesFlag() {
        return foodWinesFlag;
    }

    public void setFoodWinesFlag(String foodWinesFlag) {
        this.foodWinesFlag = foodWinesFlag;
    }

    public String getHobbiesGamesBoardPuzzlesFlag() {
        return hobbiesGamesBoardPuzzlesFlag;
    }

    public void setHobbiesGamesBoardPuzzlesFlag(String hobbiesGamesBoardPuzzlesFlag) {
        this.hobbiesGamesBoardPuzzlesFlag = hobbiesGamesBoardPuzzlesFlag;
    }

    public String getComputerAndVideoGamesPuzzles() {
        return computerAndVideoGamesPuzzles;
    }

    public void setComputerAndVideoGamesPuzzles(String computerAndVideoGamesPuzzles) {
        this.computerAndVideoGamesPuzzles = computerAndVideoGamesPuzzles;
    }

    public String getSpectatorSportsHockeyFlag() {
        return spectatorSportsHockeyFlag;
    }

    public void setSpectatorSportsHockeyFlag(String spectatorSportsHockeyFlag) {
        this.spectatorSportsHockeyFlag = spectatorSportsHockeyFlag;
    }

    public String getSpectatorSportsNASCARFlag() {
        return spectatorSportsNASCARFlag;
    }

    public void setSpectatorSportsNASCARFlag(String spectatorSportsNASCARFlag) {
        this.spectatorSportsNASCARFlag = spectatorSportsNASCARFlag;
    }

    public String getGamesVideoGamesFlag() {
        return gamesVideoGamesFlag;
    }

    public void setGamesVideoGamesFlag(String gamesVideoGamesFlag) {
        this.gamesVideoGamesFlag = gamesVideoGamesFlag;
    }

    public String getSmokingTobaccoFlag() {
        return smokingTobaccoFlag;
    }

    public void setSmokingTobaccoFlag(String smokingTobaccoFlag) {
        this.smokingTobaccoFlag = smokingTobaccoFlag;
    }

    public String getAilments() {
        return ailments;
    }

    public void setAilments(String ailments) {
        this.ailments = ailments;
    }

    public String getChildrenPresentFlag() {
        return childrenPresentFlag;
    }

    public void setChildrenPresentFlag(String childrenPresentFlag) {
        this.childrenPresentFlag = childrenPresentFlag;
    }

    public String getSecondaryName() {
        return secondaryName;
    }

    public void setSecondaryName(String secondaryName) {
        this.secondaryName = secondaryName;
    }

    public String getSecondaryNumber() {
        return secondaryNumber;
    }

    public void setSecondaryNumber(String secondaryNumber) {
        this.secondaryNumber = secondaryNumber;
    }

    public String getParentingFlag() {
        return parentingFlag;
    }

    public void setParentingFlag(String parentingFlag) {
        this.parentingFlag = parentingFlag;
    }

    public String getSportsMotorcyclingFlag() {
        return sportsMotorcyclingFlag;
    }

    public void setSportsMotorcyclingFlag(String sportsMotorcyclingFlag) {
        this.sportsMotorcyclingFlag = sportsMotorcyclingFlag;
    }

    public String getHomeImprovementDIYFlag() {
        return homeImprovementDIYFlag;
    }

    public void setHomeImprovementDIYFlag(String homeImprovementDIYFlag) {
        this.homeImprovementDIYFlag = homeImprovementDIYFlag;
    }

    public String getlSDIYLivingFlag() {
        return lSDIYLivingFlag;
    }

    public void setlSDIYLivingFlag(String lSDIYLivingFlag) {
        this.lSDIYLivingFlag = lSDIYLivingFlag;
    }

    public String getcCTravelEntertainmentFlag() {
        return cCTravelEntertainmentFlag;
    }

    public void setcCTravelEntertainmentFlag(String cCTravelEntertainmentFlag) {
        this.cCTravelEntertainmentFlag = cCTravelEntertainmentFlag;
    }

    public String getOutdoorCampingHikingFlag() {
        return outdoorCampingHikingFlag;
    }

    public void setOutdoorCampingHikingFlag(String outdoorCampingHikingFlag) {
        this.outdoorCampingHikingFlag = outdoorCampingHikingFlag;
    }

    public String getCollectiblesStampsFlag() {
        return collectiblesStampsFlag;
    }

    public void setCollectiblesStampsFlag(String collectiblesStampsFlag) {
        this.collectiblesStampsFlag = collectiblesStampsFlag;
    }

    public String gettVSatelliteDishFlag() {
        return tVSatelliteDishFlag;
    }

    public void settVSatelliteDishFlag(String tVSatelliteDishFlag) {
        this.tVSatelliteDishFlag = tVSatelliteDishFlag;
    }

    public String getEmail02() {
        return email02;
    }

    public void setEmail02(String email02) {
        this.email02 = email02;
    }

    public String getEmail03() {
        return email03;
    }

    public void setEmail03(String email03) {
        this.email03 = email03;
    }

    public String getEmail04() {
        return email04;
    }

    public void setEmail04(String email04) {
        this.email04 = email04;
    }

    public String getEmail02MD5() {
        return email02MD5;
    }

    public void setEmail02MD5(String email02MD5) {
        this.email02MD5 = email02MD5;
    }

    public String getEmail03MD5() {
        return email03MD5;
    }

    public void setEmail03MD5(String email03MD5) {
        this.email03MD5 = email03MD5;
    }

    public String getEmail04MD5() {
        return email04MD5;
    }

    public void setEmail04MD5(String email04MD5) {
        this.email04MD5 = email04MD5;
    }

    public String getRecentlyMovedFlag() {
        return recentlyMovedFlag;
    }

    public void setRecentlyMovedFlag(String recentlyMovedFlag) {
        this.recentlyMovedFlag = recentlyMovedFlag;
    }

    public String getRecentlyMovedYear() {
        return recentlyMovedYear;
    }

    public void setRecentlyMovedYear(String recentlyMovedYear) {
        this.recentlyMovedYear = recentlyMovedYear;
    }

    public String getRecentlyMovedMonth() {
        return recentlyMovedMonth;
    }

    public void setRecentlyMovedMonth(String recentlyMovedMonth) {
        this.recentlyMovedMonth = recentlyMovedMonth;
    }

    public String getMoneySeekersFlag() {
        return moneySeekersFlag;
    }

    public void setMoneySeekersFlag(String moneySeekersFlag) {
        this.moneySeekersFlag = moneySeekersFlag;
    }

    public String getEmail05() {
        return email05;
    }

    public void setEmail05(String email05) {
        this.email05 = email05;
    }

    public String getEmail05MD5() {
        return email05MD5;
    }

    public void setEmail05MD5(String email05MD5) {
        this.email05MD5 = email05MD5;
    }

    public String getSpectatorSportsRacingFlag() {
        return spectatorSportsRacingFlag;
    }

    public void setSpectatorSportsRacingFlag(String spectatorSportsRacingFlag) {
        this.spectatorSportsRacingFlag = spectatorSportsRacingFlag;
    }

    public String getSportsTennisFlag() {
        return sportsTennisFlag;
    }

    public void setSportsTennisFlag(String sportsTennisFlag) {
        this.sportsTennisFlag = sportsTennisFlag;
    }

    public String getSelfEducationOnlineFlag() {
        return selfEducationOnlineFlag;
    }

    public void setSelfEducationOnlineFlag(String selfEducationOnlineFlag) {
        this.selfEducationOnlineFlag = selfEducationOnlineFlag;
    }

    public String getHobbiesAviationFlag() {
        return hobbiesAviationFlag;
    }

    public void setHobbiesAviationFlag(String hobbiesAviationFlag) {
        this.hobbiesAviationFlag = hobbiesAviationFlag;
    }

    public String getGamesComputerGamesFlag() {
        return gamesComputerGamesFlag;
    }

    public void setGamesComputerGamesFlag(String gamesComputerGamesFlag) {
        this.gamesComputerGamesFlag = gamesComputerGamesFlag;
    }

    public String getVeteranPresentIndFlag() {
        return veteranPresentIndFlag;
    }

    public void setVeteranPresentIndFlag(String veteranPresentIndFlag) {
        this.veteranPresentIndFlag = veteranPresentIndFlag;
    }

    public String getHomeLoanToValueCode() {
        return homeLoanToValueCode;
    }

    public void setHomeLoanToValueCode(String homeLoanToValueCode) {
        this.homeLoanToValueCode = homeLoanToValueCode;
    }

    public String getEntGamingCasinoFlag() {
        return entGamingCasinoFlag;
    }

    public void setEntGamingCasinoFlag(String entGamingCasinoFlag) {
        this.entGamingCasinoFlag = entGamingCasinoFlag;
    }

    public String getWalkSequence() {
        return walkSequence;
    }

    public void setWalkSequence(String walkSequence) {
        this.walkSequence = walkSequence;
    }

    public String getPreDirection() {
        return preDirection;
    }

    public void setPreDirection(String preDirection) {
        this.preDirection = preDirection;
    }

    public String getInvestmentsForeignFlag() {
        return investmentsForeignFlag;
    }

    public void setInvestmentsForeignFlag(String investmentsForeignFlag) {
        this.investmentsForeignFlag = investmentsForeignFlag;
    }

    public String getHobbiesScienceSpaceFlag() {
        return hobbiesScienceSpaceFlag;
    }

    public void setHobbiesScienceSpaceFlag(String hobbiesScienceSpaceFlag) {
        this.hobbiesScienceSpaceFlag = hobbiesScienceSpaceFlag;
    }

    public String getAilmentArthritisFlag() {
        return ailmentArthritisFlag;
    }

    public void setAilmentArthritisFlag(String ailmentArthritisFlag) {
        this.ailmentArthritisFlag = ailmentArthritisFlag;
    }

    public String getAilmentDiabeticFlag() {
        return ailmentDiabeticFlag;
    }

    public void setAilmentDiabeticFlag(String ailmentDiabeticFlag) {
        this.ailmentDiabeticFlag = ailmentDiabeticFlag;
    }

    public String getAilmentOrthopedicFlag() {
        return ailmentOrthopedicFlag;
    }

    public void setAilmentOrthopedicFlag(String ailmentOrthopedicFlag) {
        this.ailmentOrthopedicFlag = ailmentOrthopedicFlag;
    }

    public String getOutdoorScubaDivingFlag() {
        return outdoorScubaDivingFlag;
    }

    public void setOutdoorScubaDivingFlag(String outdoorScubaDivingFlag) {
        this.outdoorScubaDivingFlag = outdoorScubaDivingFlag;
    }

    public String getPostDirection() {
        return postDirection;
    }

    public void setPostDirection(String postDirection) {
        this.postDirection = postDirection;
    }

    public String getSportsEquestrianFlag() {
        return sportsEquestrianFlag;
    }

    public void setSportsEquestrianFlag(String sportsEquestrianFlag) {
        this.sportsEquestrianFlag = sportsEquestrianFlag;
    }

    public String getMusicHomeStereoFlag() {
        return musicHomeStereoFlag;
    }

    public void setMusicHomeStereoFlag(String musicHomeStereoFlag) {
        this.musicHomeStereoFlag = musicHomeStereoFlag;
    }

    public String getTruckOwnerFlag() {
        return truckOwnerFlag;
    }

    public void setTruckOwnerFlag(String truckOwnerFlag) {
        this.truckOwnerFlag = truckOwnerFlag;
    }

    public String getMotorVehicles() {
        return motorVehicles;
    }

    public void setMotorVehicles(String motorVehicles) {
        this.motorVehicles = motorVehicles;
    }

    public String getPoliticalLiberalFlag() {
        return politicalLiberalFlag;
    }

    public void setPoliticalLiberalFlag(String politicalLiberalFlag) {
        this.politicalLiberalFlag = politicalLiberalFlag;
    }

    public String getEnvironmentWildlifeFlag() {
        return environmentWildlifeFlag;
    }

    public void setEnvironmentWildlifeFlag(String environmentWildlifeFlag) {
        this.environmentWildlifeFlag = environmentWildlifeFlag;
    }

    public String getHobbiesHousePlantFlag() {
        return hobbiesHousePlantFlag;
    }

    public void setHobbiesHousePlantFlag(String hobbiesHousePlantFlag) {
        this.hobbiesHousePlantFlag = hobbiesHousePlantFlag;
    }

    public String getrVOwnerFlag() {
        return rVOwnerFlag;
    }

    public void setrVOwnerFlag(String rVOwnerFlag) {
        this.rVOwnerFlag = rVOwnerFlag;
    }

    public String getCity2() {
        return city2;
    }

    public void setCity2(String city2) {
        this.city2 = city2;
    }

    public String getStateCity2() {
        return stateCity2;
    }

    public void setStateCity2(String stateCity2) {
        this.stateCity2 = stateCity2;
    }

    public String getSpectatorSportsSoccerFlag() {
        return spectatorSportsSoccerFlag;
    }

    public void setSpectatorSportsSoccerFlag(String spectatorSportsSoccerFlag) {
        this.spectatorSportsSoccerFlag = spectatorSportsSoccerFlag;
    }

    public String getAilmentSeniorFlag() {
        return ailmentSeniorFlag;
    }

    public void setAilmentSeniorFlag(String ailmentSeniorFlag) {
        this.ailmentSeniorFlag = ailmentSeniorFlag;
    }

    public String getMotorcycleOwnerFlag() {
        return motorcycleOwnerFlag;
    }

    public void setMotorcycleOwnerFlag(String motorcycleOwnerFlag) {
        this.motorcycleOwnerFlag = motorcycleOwnerFlag;
    }

    public String getAilmentAllergyFlag() {
        return ailmentAllergyFlag;
    }

    public void setAilmentAllergyFlag(String ailmentAllergyFlag) {
        this.ailmentAllergyFlag = ailmentAllergyFlag;
    }

    public String getNewHomeHHID() {
        return newHomeHHID;
    }

    public void setNewHomeHHID(String newHomeHHID) {
        this.newHomeHHID = newHomeHHID;
    }

    public String getNewHomeOwnerFlag() {
        return newHomeOwnerFlag;
    }

    public void setNewHomeOwnerFlag(String newHomeOwnerFlag) {
        this.newHomeOwnerFlag = newHomeOwnerFlag;
    }

    public String getBoatOwnerFlag() {
        return boatOwnerFlag;
    }

    public void setBoatOwnerFlag(String boatOwnerFlag) {
        this.boatOwnerFlag = boatOwnerFlag;
    }

    public String getAilmentDisabledFlagOwnerFlag() {
        return ailmentDisabledFlagOwnerFlag;
    }

    public void setAilmentDisabledFlagOwnerFlag(String ailmentDisabledFlagOwnerFlag) {
        this.ailmentDisabledFlagOwnerFlag = ailmentDisabledFlagOwnerFlag;
    }

    public String getAilmentDisabledFlag() {
        return ailmentDisabledFlag;
    }

    public void setAilmentDisabledFlag(String ailmentDisabledFlag) {
        this.ailmentDisabledFlag = ailmentDisabledFlag;
    }

    @Override
    public String toString() {
        return "PersonUsDbCsv{" +
            "HHID='" + HHID + '\'' +
            ", ID='" + ID + '\'' +
            ", FirstName01='" + FirstName01 + '\'' +
            ", alphafirstnamesort='" + alphafirstnamesort + '\'' +
            ", PhoneticFirstName='" + PhoneticFirstName + '\'' +
            ", MiddleName01='" + MiddleName01 + '\'' +
            ", LastName01='" + LastName01 + '\'' +
            ", alphalastnamesort='" + alphalastnamesort + '\'' +
            ", PhoneticLastName='" + PhoneticLastName + '\'' +
            ", Address='" + Address + '\'' +
            ", alphaaddresssort='" + alphaaddresssort + '\'' +
            ", City='" + City + '\'' +
            ", CITYPHRASE='" + CITYPHRASE + '\'' +
            ", alphacitysort='" + alphacitysort + '\'' +
            ", Cities='" + Cities + '\'' +
            ", State='" + State + '\'' +
            ", alphastatesort='" + alphastatesort + '\'' +
            ", ZIP='" + ZIP + '\'' +
            ", ZIP4='" + ZIP4 + '\'' +
            ", CarrierRoute='" + CarrierRoute + '\'' +
            ", DeliveryPoint='" + DeliveryPoint + '\'' +
            ", MailScoreCode='" + MailScoreCode + '\'' +
            ", geoLevelCode='" + geoLevelCode + '\'' +
            ", Latitude='" + Latitude + '\'' +
            ", Longitude='" + Longitude + '\'' +
            ", timeZoneCode='" + timeZoneCode + '\'' +
            ", countyCode='" + countyCode + '\'' +
            ", countyDescription='" + countyDescription + '\'' +
            ", cBSACode='" + cBSACode + '\'' +
            ", cBSADescription='" + cBSADescription + '\'' +
            ", scrubbedPhoneableFlag='" + scrubbedPhoneableFlag + '\'' +
            ", indGenderCode='" + indGenderCode + '\'' +
            ", indDateOfBirthYear='" + indDateOfBirthYear + '\'' +
            ", indDateOfBirthMonth='" + indDateOfBirthMonth + '\'' +
            ", indAge='" + indAge + '\'' +
            ", indOccupationCode='" + indOccupationCode + '\'' +
            ", indHouseholdRankCode='" + indHouseholdRankCode + '\'' +
            ", indEthnicCode='" + indEthnicCode + '\'' +
            ", indPoliticalPartyCode='" + indPoliticalPartyCode + '\'' +
            ", homeValueCode='" + homeValueCode + '\'' +
            ", homeValueDescription='" + homeValueDescription + '\'' +
            ", homeMedianValueCode='" + homeMedianValueCode + '\'' +
            ", homeMedianValueDescription='" + homeMedianValueDescription + '\'' +
            ", homeOwnerRenterCode='" + homeOwnerRenterCode + '\'' +
            ", homePurchaseDate='" + homePurchaseDate + '\'' +
            ", homePurchaseYear='" + homePurchaseYear + '\'' +
            ", lengthOfResidenceCode='" + lengthOfResidenceCode + '\'' +
            ", homeBuiltYear='" + homeBuiltYear + '\'' +
            ", homeBuiltYearCode='" + homeBuiltYearCode + '\'' +
            ", homeBuiltYearDescription='" + homeBuiltYearDescription + '\'' +
            ", homeDwellingTypeCode='" + homeDwellingTypeCode + '\'' +
            ", medianIncomeCode='" + medianIncomeCode + '\'' +
            ", medianIncomeDescription='" + medianIncomeDescription + '\'' +
            ", incomeCode='" + incomeCode + '\'' +
            ", incomeDescription='" + incomeDescription + '\'' +
            ", netWorthCode='" + netWorthCode + '\'' +
            ", creditCapacity='" + creditCapacity + '\'' +
            ", creditCapacityCode='" + creditCapacityCode + '\'' +
            ", creditCapacityDescription='" + creditCapacityDescription + '\'' +
            ", cCUserFlag='" + cCUserFlag + '\'' +
            ", creditCardMailOrderBuyers='" + creditCardMailOrderBuyers + '\'' +
            ", cCBankFlag='" + cCBankFlag + '\'' +
            ", cCUnknownFlag='" + cCUnknownFlag + '\'' +
            ", cCPremiumFlag='" + cCPremiumFlag + '\'' +
            ", donorCapacityCode='" + donorCapacityCode + '\'' +
            ", charitableFlag='" + charitableFlag + '\'' +
            ", donor='" + donor + '\'' +
            ", childrensFlag='" + childrensFlag + '\'' +
            ", religiousFlag='" + religiousFlag + '\'' +
            ", numberChildrenCode='" + numberChildrenCode + '\'' +
            ", maritalStatusCode='" + maritalStatusCode + '\'' +
            ", veteranPresentHHFlag='" + veteranPresentHHFlag + '\'' +
            ", entTheaterPerformingArtsFlag='" + entTheaterPerformingArtsFlag + '\'' +
            ", artsHistoryScience='" + artsHistoryScience + '\'' +
            ", entSweepstakesContestsFlag='" + entSweepstakesContestsFlag + '\'' +
            ", investingFinance='" + investingFinance + '\'' +
            ", readingGeneralFlag='" + readingGeneralFlag + '\'' +
            ", reading='" + reading + '\'' +
            ", readingReligiousInspirationalFlag='" + readingReligiousInspirationalFlag + '\'' +
            ", readingScienceFictionFlag='" + readingScienceFictionFlag + '\'' +
            ", readingMagazinesFlag='" + readingMagazinesFlag + '\'' +
            ", investmentsPersonalFlag='" + investmentsPersonalFlag + '\'' +
            ", investmentsStocksBondsFlag='" + investmentsStocksBondsFlag + '\'' +
            ", travelDomesticFlag='" + travelDomesticFlag + '\'' +
            ", travel='" + travel + '\'' +
            ", travelInternationalFlag='" + travelInternationalFlag + '\'' +
            ", travelRVFlag='" + travelRVFlag + '\'' +
            ", travelCruisesFlag='" + travelCruisesFlag + '\'' +
            ", musicPlayerFlag='" + musicPlayerFlag + '\'' +
            ", movieMusic='" + movieMusic + '\'' +
            ", selfExerciseWalkingFlag='" + selfExerciseWalkingFlag + '\'' +
            ", healthandFitness='" + healthandFitness + '\'' +
            ", selfExerciseAerobicFlag='" + selfExerciseAerobicFlag + '\'' +
            ", selfDietingWeightLossFlag='" + selfDietingWeightLossFlag + '\'' +
            ", collectiblesGeneralFlag='" + collectiblesGeneralFlag + '\'' +
            ", collectiblesAndAntiques='" + collectiblesAndAntiques + '\'' +
            ", collectiblesCoinsFlag='" + collectiblesCoinsFlag + '\'' +
            ", hobbiesAutoWorkFlag='" + hobbiesAutoWorkFlag + '\'' +
            ", hobbyInterest='" + hobbyInterest + '\'' +
            ", hobbiesCraftsFlag='" + hobbiesCraftsFlag + '\'' +
            ", hobbiesWoodworkingFlag='" + hobbiesWoodworkingFlag + '\'' +
            ", hobbiesGardeningFlag='" + hobbiesGardeningFlag + '\'' +
            ", homeImprovement='" + homeImprovement + '\'' +
            ", homeFurnishingsDecoratingFlag='" + homeFurnishingsDecoratingFlag + '\'' +
            ", outdoorFishingFlag='" + outdoorFishingFlag + '\'' +
            ", outdoorEnthusiast='" + outdoorEnthusiast + '\'' +
            ", outdoorHuntingShootingFlag='" + outdoorHuntingShootingFlag + '\'' +
            ", outdoorBoatingSailingFlag='" + outdoorBoatingSailingFlag + '\'' +
            ", spectatorSportsFootballFlag='" + spectatorSportsFootballFlag + '\'' +
            ", sports='" + sports + '\'' +
            ", spectatorSportsBaseballFlag='" + spectatorSportsBaseballFlag + '\'' +
            ", spectatorSportsTVSportsFlag='" + spectatorSportsTVSportsFlag + '\'' +
            ", sportsGolfFlag='" + sportsGolfFlag + '\'' +
            ", sportsSkiingFlag='" + sportsSkiingFlag + '\'' +
            ", environmentalIssuesFlag='" + environmentalIssuesFlag + '\'' +
            ", grandchildrenFlag='" + grandchildrenFlag + '\'' +
            ", familyReligionPolitics='" + familyReligionPolitics + '\'' +
            ", otherPetOwnerFlag='" + otherPetOwnerFlag + '\'' +
            ", animalsPets='" + animalsPets + '\'' +
            ", mailOrderBuyerFlag='" + mailOrderBuyerFlag + '\'' +
            ", mailOrderResponderFlag='" + mailOrderResponderFlag + '\'' +
            ", pCOwnerFlag='" + pCOwnerFlag + '\'' +
            ", computersElectronics='" + computersElectronics + '\'' +
            ", consumerElectronicsFlag='" + consumerElectronicsFlag + '\'' +
            ", lSHomeLivingFlag='" + lSHomeLivingFlag + '\'' +
            ", lSSportyLivingFlag='" + lSSportyLivingFlag + '\'' +
            ", lSUpscaleLivingFlag='" + lSUpscaleLivingFlag + '\'' +
            ", lSHighbrowLivingFlag='" + lSHighbrowLivingFlag + '\'' +
            ", lSCommonLivingFlag='" + lSCommonLivingFlag + '\'' +
            ", lSBroaderLivingFlag='" + lSBroaderLivingFlag + '\'' +
            ", deliveryPointCheckDigit='" + deliveryPointCheckDigit + '\'' +
            ", addressNumber='" + addressNumber + '\'' +
            ", streetName='" + streetName + '\'' +
            ", streetSuffix='" + streetSuffix + '\'' +
            ", stateCity='" + stateCity + '\'' +
            ", addressID='" + addressID + '\'' +
            ", pOFlag='" + pOFlag + '\'' +
            ", mailableFlag='" + mailableFlag + '\'' +
            ", locationUniqueFlag='" + locationUniqueFlag + '\'' +
            ", cellPhone='" + cellPhone + '\'' +
            ", mostRecentHomePurchaseDateFlag='" + mostRecentHomePurchaseDateFlag + '\'' +
            ", productionDate='" + productionDate + '\'' +
            ", indAgeCode='" + indAgeCode + '\'' +
            ", latLong='" + latLong + '\'' +
            ", geoLatLong='" + geoLatLong + '\'' +
            ", marketing='" + marketing + '\'' +
            ", mailable='" + mailable + '\'' +
            ", phoneable='" + phoneable + '\'' +
            ", mailablePhoneable='" + mailablePhoneable + '\'' +
            ", zIP9='" + zIP9 + '\'' +
            ", zip11='" + zip11 + '\'' +
            ", zip4Exists='" + zip4Exists + '\'' +
            ", addressMaster='" + addressMaster + '\'' +
            ", lSGreenLivingFlag='" + lSGreenLivingFlag + '\'' +
            ", version='" + version + '\'' +
            ", latLong0coordinate='" + latLong0coordinate + '\'' +
            ", latLong1coordinate='" + latLong1coordinate + '\'' +
            ", emailPresentFlag='" + emailPresentFlag + '\'' +
            ", email='" + email + '\'' +
            ", homeSquareFootage='" + homeSquareFootage + '\'' +
            ", homeSquareFootageCode='" + homeSquareFootageCode + '\'' +
            ", animalWelfareFlag='" + animalWelfareFlag + '\'' +
            ", healthFlag='" + healthFlag + '\'' +
            ", internationalAidFlag='" + internationalAidFlag + '\'' +
            ", politicalFlag='" + politicalFlag + '\'' +
            ", politicalAffiliationDonor='" + politicalAffiliationDonor + '\'' +
            ", politicalConservativeFlag='" + politicalConservativeFlag + '\'' +
            ", veteransFlag='" + veteransFlag + '\'' +
            ", foodsNaturalFlag='" + foodsNaturalFlag + '\'' +
            ", cookingFood='" + cookingFood + '\'' +
            ", musicListenerFlag='" + musicListenerFlag + '\'' +
            ", selfExerciseRunningJoggingFlag='" + selfExerciseRunningJoggingFlag + '\'' +
            ", selfHealthMedicalFlag='" + selfHealthMedicalFlag + '\'' +
            ", selfImprovementFlag='" + selfImprovementFlag + '\'' +
            ", careerSelfImprovement='" + careerSelfImprovement + '\'' +
            ", selfCareerImprovementFlag='" + selfCareerImprovementFlag + '\'' +
            ", collectorAvidFlag='" + collectorAvidFlag + '\'' +
            ", hobbiesSewingKnittingNeedleworkFlag='" + hobbiesSewingKnittingNeedleworkFlag + '\'' +
            ", spectatorSportsBasketballFlag='" + spectatorSportsBasketballFlag + '\'' +
            ", sportsCollectiblesMemorabiliaFlag='" + sportsCollectiblesMemorabiliaFlag + '\'' +
            ", currentAffairsPoliticsFlag='" + currentAffairsPoliticsFlag + '\'' +
            ", vehicleOwnedCode='" + vehicleOwnedCode + '\'' +
            ", catOwnerFlag='" + catOwnerFlag + '\'' +
            ", lSProfessionalLivingFlag='" + lSProfessionalLivingFlag + '\'' +
            ", email01MD5='" + email01MD5 + '\'' +
            ", numberofBedrooms='" + numberofBedrooms + '\'' +
            ", numberofBathrooms='" + numberofBathrooms + '\'' +
            ", cCGasDeptRetailFlag='" + cCGasDeptRetailFlag + '\'' +
            ", cCUpscaleDeptFlag='" + cCUpscaleDeptFlag + '\'' +
            ", mailOrderDonorFlag='" + mailOrderDonorFlag + '\'' +
            ", cookingGeneralFlag='" + cookingGeneralFlag + '\'' +
            ", cookingGourmetFlag='" + cookingGourmetFlag + '\'' +
            ", collectiblesArtsFlag='" + collectiblesArtsFlag + '\'' +
            ", collectiblesAntiquesFlag='" + collectiblesAntiquesFlag + '\'' +
            ", beautyCosmeticsFlag='" + beautyCosmeticsFlag + '\'' +
            ", beautyFashion='" + beautyFashion + '\'' +
            ", childrensInterestsFlag='" + childrensInterestsFlag + '\'' +
            ", areaCode='" + areaCode + '\'' +
            ", phone='" + phone + '\'' +
            ", dNCFlag='" + dNCFlag + '\'' +
            ", artsCulturalFlag='" + artsCulturalFlag + '\'' +
            ", entArtsFlag='" + entArtsFlag + '\'' +
            ", hobbiesHistoryMilitaryFlag='" + hobbiesHistoryMilitaryFlag + '\'' +
            ", hobbiesPhotographyFlag='" + hobbiesPhotographyFlag + '\'' +
            ", religiousInspirationalFlag='" + religiousInspirationalFlag + '\'' +
            ", dogOwnerFlag='" + dogOwnerFlag + '\'' +
            ", christianFamilyFlag='" + christianFamilyFlag + '\'' +
            ", homePropertyTypeCode02='" + homePropertyTypeCode02 + '\'' +
            ", homeEquityAvailableCode='" + homeEquityAvailableCode + '\'' +
            ", homeEquityAvailableDescription='" + homeEquityAvailableDescription + '\'' +
            ", readingFinancialNewsletterFlag='" + readingFinancialNewsletterFlag + '\'' +
            ", investmentsRealEstateFlag='" + investmentsRealEstateFlag + '\'' +
            ", musicCollectorFlag='" + musicCollectorFlag + '\'' +
            ", movieCollectorFlag='" + movieCollectorFlag + '\'' +
            ", readingAudioBooksFlag='" + readingAudioBooksFlag + '\'' +
            ", foodWinesFlag='" + foodWinesFlag + '\'' +
            ", hobbiesGamesBoardPuzzlesFlag='" + hobbiesGamesBoardPuzzlesFlag + '\'' +
            ", computerAndVideoGamesPuzzles='" + computerAndVideoGamesPuzzles + '\'' +
            ", spectatorSportsHockeyFlag='" + spectatorSportsHockeyFlag + '\'' +
            ", spectatorSportsNASCARFlag='" + spectatorSportsNASCARFlag + '\'' +
            ", gamesVideoGamesFlag='" + gamesVideoGamesFlag + '\'' +
            ", smokingTobaccoFlag='" + smokingTobaccoFlag + '\'' +
            ", ailments='" + ailments + '\'' +
            ", childrenPresentFlag='" + childrenPresentFlag + '\'' +
            ", secondaryName='" + secondaryName + '\'' +
            ", secondaryNumber='" + secondaryNumber + '\'' +
            ", parentingFlag='" + parentingFlag + '\'' +
            ", sportsMotorcyclingFlag='" + sportsMotorcyclingFlag + '\'' +
            ", homeImprovementDIYFlag='" + homeImprovementDIYFlag + '\'' +
            ", lSDIYLivingFlag='" + lSDIYLivingFlag + '\'' +
            ", cCTravelEntertainmentFlag='" + cCTravelEntertainmentFlag + '\'' +
            ", outdoorCampingHikingFlag='" + outdoorCampingHikingFlag + '\'' +
            ", collectiblesStampsFlag='" + collectiblesStampsFlag + '\'' +
            ", tVSatelliteDishFlag='" + tVSatelliteDishFlag + '\'' +
            ", email02='" + email02 + '\'' +
            ", email03='" + email03 + '\'' +
            ", email04='" + email04 + '\'' +
            ", email02MD5='" + email02MD5 + '\'' +
            ", email03MD5='" + email03MD5 + '\'' +
            ", email04MD5='" + email04MD5 + '\'' +
            ", recentlyMovedFlag='" + recentlyMovedFlag + '\'' +
            ", recentlyMovedYear='" + recentlyMovedYear + '\'' +
            ", recentlyMovedMonth='" + recentlyMovedMonth + '\'' +
            ", moneySeekersFlag='" + moneySeekersFlag + '\'' +
            ", email05='" + email05 + '\'' +
            ", email05MD5='" + email05MD5 + '\'' +
            ", spectatorSportsRacingFlag='" + spectatorSportsRacingFlag + '\'' +
            ", sportsTennisFlag='" + sportsTennisFlag + '\'' +
            ", selfEducationOnlineFlag='" + selfEducationOnlineFlag + '\'' +
            ", hobbiesAviationFlag='" + hobbiesAviationFlag + '\'' +
            ", gamesComputerGamesFlag='" + gamesComputerGamesFlag + '\'' +
            ", veteranPresentIndFlag='" + veteranPresentIndFlag + '\'' +
            ", homeLoanToValueCode='" + homeLoanToValueCode + '\'' +
            ", entGamingCasinoFlag='" + entGamingCasinoFlag + '\'' +
            ", walkSequence='" + walkSequence + '\'' +
            ", preDirection='" + preDirection + '\'' +
            ", investmentsForeignFlag='" + investmentsForeignFlag + '\'' +
            ", hobbiesScienceSpaceFlag='" + hobbiesScienceSpaceFlag + '\'' +
            ", ailmentArthritisFlag='" + ailmentArthritisFlag + '\'' +
            ", ailmentDiabeticFlag='" + ailmentDiabeticFlag + '\'' +
            ", ailmentOrthopedicFlag='" + ailmentOrthopedicFlag + '\'' +
            ", outdoorScubaDivingFlag='" + outdoorScubaDivingFlag + '\'' +
            ", postDirection='" + postDirection + '\'' +
            ", sportsEquestrianFlag='" + sportsEquestrianFlag + '\'' +
            ", musicHomeStereoFlag='" + musicHomeStereoFlag + '\'' +
            ", truckOwnerFlag='" + truckOwnerFlag + '\'' +
            ", motorVehicles='" + motorVehicles + '\'' +
            ", politicalLiberalFlag='" + politicalLiberalFlag + '\'' +
            ", environmentWildlifeFlag='" + environmentWildlifeFlag + '\'' +
            ", hobbiesHousePlantFlag='" + hobbiesHousePlantFlag + '\'' +
            ", rVOwnerFlag='" + rVOwnerFlag + '\'' +
            ", city2='" + city2 + '\'' +
            ", stateCity2='" + stateCity2 + '\'' +
            ", spectatorSportsSoccerFlag='" + spectatorSportsSoccerFlag + '\'' +
            ", ailmentSeniorFlag='" + ailmentSeniorFlag + '\'' +
            ", motorcycleOwnerFlag='" + motorcycleOwnerFlag + '\'' +
            ", ailmentAllergyFlag='" + ailmentAllergyFlag + '\'' +
            ", newHomeHHID='" + newHomeHHID + '\'' +
            ", newHomeOwnerFlag='" + newHomeOwnerFlag + '\'' +
            ", boatOwnerFlag='" + boatOwnerFlag + '\'' +
            ", ailmentDisabledFlagOwnerFlag='" + ailmentDisabledFlagOwnerFlag + '\'' +
            ", ailmentDisabledFlag='" + ailmentDisabledFlag + '\'' +
            '}';
    }
}
