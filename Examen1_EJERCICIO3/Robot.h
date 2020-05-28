#ifndef ROBOT_H
#define ROBOT_H
#include <string>

using namespace std;

class Robot {
public:
    void setSerie(string);
    string getSerie();
    Robot();
    Robot(const Robot& orig);
    virtual ~Robot();
private:
    string Serie;
};

#endif 

