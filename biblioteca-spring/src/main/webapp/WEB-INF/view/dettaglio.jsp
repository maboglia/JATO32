<%@ include file="header.jsp" %>


    <a href="index.html">Home</a>
    <a href="elenco.html">Elenco</a>
    
    <h1>Dettaglio Libro</h1>
  
    
<div class="card" style="width: 18rem;">
  <img src="https://www.liceofermiaversa.edu.it/wp-content/uploads/2019/09/libro_abierto.jpg" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title">${libro.titolo}</h5>
        <p class="card-text">Pagine: ${libro.pagine}</p>
    <p class="card-text">Editore: ${libro.editore_id}</p>
    <p class="card-text">Prezzo Iva: ${libro.prezzo_iva}</p>
    <p class="card-text">Prezzo: ${libro.prezzo}</p>  <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>    
    

<%@ include file="footer.jsp" %>
