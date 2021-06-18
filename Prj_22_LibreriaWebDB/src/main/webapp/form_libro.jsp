<form action="libri" method="post">

    <input type="text" name="titolo" placeholder="titolo">
    <input type="text" id="prezzo" name="prezzo" placeholder="prezzo">
    <input type="text" name="pagine" placeholder="pagine">
    <input type="text" id="prezzo_iva" name="prezzo_iva" placeholder="prezzo_iva">
    <input type="text" name="editore_id" placeholder="editore_id">

    <input type="submit" value="Aggiungi libro">

</form>


<script>

    var p1 = document.getElementById("prezzo");
    var p2 = document.getElementById("prezzo_iva");

    p1.onchange = function(){
        p2.value = p1.value * 1.22;
    }

</script>