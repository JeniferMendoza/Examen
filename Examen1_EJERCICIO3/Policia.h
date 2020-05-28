#ifndef POLICIA_H
#define POLICIA_H
#include "Ciudadano.h"

using namespace std;

class Policia : public Ciudadano {
public:
    void setPlaca(string);
    string getPlaca();
    void Lanzar() override;
    Policia();
    Policia(const Policia& orig);
    virtual ~Policia();
private:
    string Placa;
};

#endif /* POLICIA_H */ 

