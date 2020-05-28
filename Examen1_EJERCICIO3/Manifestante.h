#ifndef MANIFESTANTE_H
#define MANIFESTANTE_H
#include "Ciudadano.h"

using namespace std;

class Manifestante: public Ciudadano {
public:
    void setMotivo(string);
    string getMotivo();
    void Lanzar() override;
    Manifestante();
    Manifestante(const Manifestante& orig);
    virtual ~Manifestante();
private:
    string Motivo;
};

#endif /* MANIFESTANTE_H */ 
