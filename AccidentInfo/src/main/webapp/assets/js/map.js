$(function(){

    $("#region_select").change(function(){
        let sido = $("#region_select").find("option:selected").val();
        getMapInfo(sido);
    });

    getMapInfo("서울특별시")

    function getMapInfo(sido){
        $.ajax({
            type:"get",
            url:"/api/oldMap/"+sido,
            success:function(r){
                console.log(r);

                var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
                mapOption = { 
                    center: new kakao.maps.LatLng(37.564718, 126.977108), // 지도의 중심좌표
                    level: 10 // 지도의 확대 레벨
                };
            
                var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

                let la_crd = new Array();
                let lo_crd = new Array();
                for(let i=0; i<r.oldMap.length; i++){
                    let la = r.oldMap[i].la_crd;
                    let lo = r.oldMap[i].lo_crd;
                    // 마커가 표시될 위치입니다 
                    var markerPosition  = new kakao.maps.LatLng( r.oldMap[i].la_crd, r.oldMap[i].lo_crd); 
                    // 마커를 생성합니다
                    var marker = new kakao.maps.Marker({
                        position: markerPosition
                    });
                    // 마커가 지도 위에 표시되도록 설정합니다
                    marker.setMap(map);
                }



                // 아래 코드는 지도 위의 마커를 제거하는 코드입니다
                // marker.setMap(null);    

            }
        })
    }
})  