#include "Policia.h"

Policia::Policia() {
}

Policia::Policia(const Policia& orig) {
}

Policia::~Policia() {
}
string Policia::getPlaca(){
    return Placa;
}
void Policia:: setPlaca(string a){
    this->Placa=a;
}
void Policia :: Lanzar (){
    cout <<"El policia tira bombas lacrimogenas"<<endl;
}

