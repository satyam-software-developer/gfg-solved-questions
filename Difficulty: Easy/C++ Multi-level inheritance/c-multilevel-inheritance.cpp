class test : public student {
protected:
    float marks[5];

public:
    void set_marks(float m[]) {
        for (int i = 0; i < 5; i++)
            marks[i] = m[i];
    }
};

class result : public test {
public:
    void display() {
        float total = 0;

        for (int i = 0; i < 5; i++)
            total += marks[i];

        float average = total / 5;

        cout << roll_number << " " << total << " " << average << endl;
    }
};