#include "Ciudadano.h"

Ciudadano::Ciudadano() {
}

Ciudadano::Ciudadano(const Ciudadano& orig) {
}

Ciudadano::~Ciudadano() {
}
string Ciudadano::getID(){
    return ID;
}
void Ciudadano:: setID(string a){
    this->ID=a;
}
string Ciudadano::getNombre(){
    return Nombre;
}
void Ciudadano:: setNombre(string a){
    this->Nombre=a;
}

void Ciudadano :: Lanzar (){
    cout <<"El ciudadano tira piedras"<<endl;
}

