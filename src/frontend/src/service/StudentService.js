import {AXIOS} from "@/Config/AxiosConfig";

class StudentService {
  postStudent(form){
    AXIOS
      .post('student/imp' , form)
      .then(() => {
        alert("Studentul a fost inregistrat")
      })
      .catch(() => {})
  }

}


export default new StudentService()
