
# Gestione dispositivi

## importare in un file ``` env.properies ``` le seguenti variabili

- JWT_SECRET
- JWT_EXPIRATION
- PORTA
- URL_DATABASE
- DATABASE_USERNAME
- DATABASE_PASSWORD

## per usare  gli endpoint seguire i seguenti passaggi:

1) registrarsi sull'endpoint ``` http://localhost:porta/enter/registration ``` 
inserendo il seguente oggetto come body inserendo i tuoi dati:
```
 {
"username":valore,
"nome":valore,
"email":valore,
"cognome":valore,
"password":valore
}
```
2) fare il login sull'endpoint``` http://localhost:porta/enter/login``` 
inserendo il seguente oggetto come body :
```
 {
    "email":valore,
    "password":valore
}
```
come risposta si riceve un ``` token``` che deve essere salvato

3)Per fare altri tipi di chiamate  inserire il token ricevuto in precedenza come ``` 'Baerer token' ```

## per effettuare modifica del profilo 

fare una chiamata di tipo  ``` PUT ``` al seguente endpoint ``` http://localhost:porta/users/:id``` 
inserendo al posto dei ``` :id ``` l'id del profilo da modificare , il token come detto in precedenza e il seguente body aggiungendo i nuovi dati:

```
{
"username":valore,
"nome":valore,
"email":valore,
"cognome":valore,
"password":valore
}
```

## per aggiungere dispositivo 

fare una chiamata di tipo  ``` POST ``` al seguente endpoint ``` http://localhost:porta/dispositivi``` 
inserendo  il token come detto in precedenza e il seguente body aggiungendo i dati:
```
{ 
"stato":stringa,
"dispositivo":stringa,
"nome":stringa,
"marca":stringa,
"ram":int,
"dimensioneSchermo":stringa,
"utenteId":stringa id utente a cui collegare il dispositivo
}
```
## per modificare dispositivo

fare una chiamata di tipo  ``` PUT ``` al seguente endpoint ``` http://localhost:porta/dispositivi/:id``` 
inserendo al posto dei ``` :id ``` l'id del dispositivo da modificare , il token come detto in precedenza e il seguente body aggiungendo i nuovi dati:

```
{ 
"stato":stringa,
"dispositivo":stringa,
"nome":stringa,
"marca":stringa,
"ram":int,
"dimensioneSchermo":stringa,
"utenteId":stringa id utente a cui collegare il dispositivo
}
```

# ⚠️⚠️!ATTENZIONE!⚠️⚠️

### come STATO del disositivo inserire UNO tra i segueni valori
```
disponibile, assegnato, in_manutenzione, dismesso
```

### invece come DISPOSITIVO inserire UNO tra i seguenti valori
```
tablet, laptop, smartphone
```
