function openPersonalModal(id){
    console.log(id);
    $.ajax({
        url: "/save_update/"+id
      }).success(function(data) {
        alert(data); // imprimimos la respuesta
      }).fail(function() {
        alert("Algo salió mal");
      });
}
