
package id.geekgarden.retrofitlogin_prod.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("room_available")
    @Expose
    private Integer roomAvailable;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("star_rating")
    @Expose
    private String starRating;
    @SerializedName("business_uri")
    @Expose
    private String businessUri;
    @SerializedName("province_name")
    @Expose
    private String provinceName;
    @SerializedName("kecamatan_name")
    @Expose
    private String kecamatanName;
    @SerializedName("kelurahan_name")
    @Expose
    private String kelurahanName;
    @SerializedName("room_max_occupancies")
    @Expose
    private String roomMaxOccupancies;
    @SerializedName("photo_primary")
    @Expose
    private String photoPrimary;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("tripadvisor_avg_rating")
    @Expose
    private TripadvisorAvgRating tripadvisorAvgRating;
    @SerializedName("room_facility_name")
    @Expose
    private String roomFacilityName;
    @SerializedName("oldprice")
    @Expose
    private String oldprice;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("wifi")
    @Expose
    private String wifi;
    @SerializedName("promo_name")
    @Expose
    private String promoName;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("total_price")
    @Expose
    private String totalPrice;
    @SerializedName("regional")
    @Expose
    private String regional;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("hotel_id")
    @Expose
    private String hotelId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRoomAvailable() {
        return roomAvailable;
    }

    public void setRoomAvailable(Integer roomAvailable) {
        this.roomAvailable = roomAvailable;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public String getBusinessUri() {
        return businessUri;
    }

    public void setBusinessUri(String businessUri) {
        this.businessUri = businessUri;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getKecamatanName() {
        return kecamatanName;
    }

    public void setKecamatanName(String kecamatanName) {
        this.kecamatanName = kecamatanName;
    }

    public String getKelurahanName() {
        return kelurahanName;
    }

    public void setKelurahanName(String kelurahanName) {
        this.kelurahanName = kelurahanName;
    }

    public String getRoomMaxOccupancies() {
        return roomMaxOccupancies;
    }

    public void setRoomMaxOccupancies(String roomMaxOccupancies) {
        this.roomMaxOccupancies = roomMaxOccupancies;
    }

    public String getPhotoPrimary() {
        return photoPrimary;
    }

    public void setPhotoPrimary(String photoPrimary) {
        this.photoPrimary = photoPrimary;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public TripadvisorAvgRating getTripadvisorAvgRating() {
        return tripadvisorAvgRating;
    }

    public void setTripadvisorAvgRating(TripadvisorAvgRating tripadvisorAvgRating) {
        this.tripadvisorAvgRating = tripadvisorAvgRating;
    }

    public String getRoomFacilityName() {
        return roomFacilityName;
    }

    public void setRoomFacilityName(String roomFacilityName) {
        this.roomFacilityName = roomFacilityName;
    }

    public String getOldprice() {
        return oldprice;
    }

    public void setOldprice(String oldprice) {
        this.oldprice = oldprice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

}
