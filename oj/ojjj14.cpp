#include <vector>
typedef unsigned long long ull;
class ProdFib
{
public:
    static std::vector<ull> productFib(ull prod){
        ull l = 0;
        ull r = 1;
        while (lr < prod){
            l = r + l;

            r = r+l;
            l = r - l;
            r = r - l;
        }
        return {l, r, rl == prod};
    }
};