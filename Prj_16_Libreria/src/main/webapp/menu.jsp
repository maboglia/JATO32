<%

	String[][] link = {
		{"home","?"},//<a href='?'>home</a>
		{"add libro","?page=addLibro"},
		{"list libri","?page=listLibro"},
//		{"view libro","?page="},
		{"view carrello","?page=cart"}
	};


	for(String[] item : link){
		out.print("<a href='"+item[1]+"'>"+item[0]+"</a> | ");
	}

%>
