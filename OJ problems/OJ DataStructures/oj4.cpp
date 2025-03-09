int solve (std::vector<int> v){
    int ans = 0;
    for(int i=0; i < v.size(); i++){
        bool f = false;
        for(int j = 0; j < v.size(); j++){
            if(v[i] == v[j]*(-1)){
                f = true;
            }
        }
        if(!f){
            return v[i];
        }
    }
}