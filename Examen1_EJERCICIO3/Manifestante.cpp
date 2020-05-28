#include "Manifestante.h"

Manifestante::Manifestante() {
}

Manifestante::Manifestante(const Manifestante& orig) {
}

Manifestante::~Manifestante() {
}
string Manifestante::getMotivo(){
    return Motivo;
}
void Manifestante:: setMotivo(string a){
    this->Motivo=a;
}
void Manifestante :: Lanzar (){
    cout <<"El manifestante tira piedras"<<endl;
}

