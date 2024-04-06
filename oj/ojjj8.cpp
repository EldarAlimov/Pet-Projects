class Dinglemouse
{
    std::string name;
    int age;
    char sex;
    std::string lo;

public:

    Dinglemouse()
    {
    }

    Dinglemouse &setAge(int age)
    {
        this->age = age;
        if(lo.find('a') == std::string::npos){
            this->lo += 'a';
        }
        return this;
    }

    Dinglemouse &setSex(char sex)
    {
        this->sex = sex;
        if(lo.find('s') == std::string::npos){
            this->lo += 's';
        }
        returnthis;
    }

    Dinglemouse &setName(const std::string &name)
    {
        this->name = name;
        if(lo.find('n') == std::string::npos){
            this->lo += 'n';
        }
        return *this;
    }

    std::string hello()
    {
        std::string s = "Hello.";

        for(int i = 0; i < this->lo.size(); i++){
            if(lo[i] == 'n') s += " My name is " + name + ".";
            if(lo[i] == 's') s += 'M' == sex ? " I am male." : " I am female.";
            if(lo[i] == 'a') s += " I am " + std::to_string(age) + ".";
        }
        return s;
    }
};