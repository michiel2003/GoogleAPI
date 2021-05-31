let map;

new Vue({
    el: "#app",
    data: {
    },
    mounted: function () {
        axios.get("http://localhost:8070/status")
            .then(response => (console.log("java status: " + response.data)))
    }
})


function initMap() {
    map = new google.maps.Map(document.getElementById("map"), {
        center: { lat: -34.397, lng: 150.644 },
        zoom: 8,
    });
    var geocoder = new google.maps.Geocoder();
    map.addListener("click", (mapsMouseEvent) => {
        console.log(mapsMouseEvent.latLng.lat())
        console.log(mapsMouseEvent.latLng.lng())
        new google.maps.Marker({
            position: mapsMouseEvent.latLng,
            map,
        })
        geocoder.geocode({
            'latLng': mapsMouseEvent.latLng
          }, function(results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
              if (results[0]) {
                  axios.get("http://localhost:8070/newMarker?lat=" + mapsMouseEvent.latLng.lat() + "&lng=" + mapsMouseEvent.latLng.lng() + "&placeinfo=" + results[0].formatted_address)
              }
            }
            
          });
    });

    
}