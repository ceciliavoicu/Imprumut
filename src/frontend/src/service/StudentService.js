import {AXIOS} from "@/Config/AxiosConfig";

class StudentService {
  postStudent(form){
    AXIOS
      .post('student/imp' , form)
      .then(() => {
        alert("Studentul a fost inregistrat")
        window.location.reload()
      })
      .catch(() => {})
  }

  deleteStudent(id){
   AXIOS
     .delete('student/imp' , {
     params:{
     id: Number(id)
     }
     })
     .then(() => {
       alert("Studentul a fost sters!")
       window.location.reload()
     })
     .catch(() => {})
  }

  getAllStudenti(){
  return AXIOS
  .get('student/imp')
  }
}


export default new StudentService()
