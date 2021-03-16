var Http = require( 'http' );
var server = Http.createServer(function(request,response){
    console.log('Solicitud entrante...');
    console.log(request.url);
    console.log(request.method);
    response.write("Hola desde el node");// no se envía por que no se indica fin de la respuesta
    response.end();
});

server.listen( 3000, function( ) {
console.log( 'Escuchando conexión en el puerto 3000' );
});
