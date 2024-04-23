import instance from "../../common/configs/axios-config"
import { IUser } from "../model/user"

export const findAllUsersAPI = async (page: number) =>{
    try{
        const response = await instance().get('/users/list',{
            params: {page, limit: 10}
        })
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
}

export const findUserByIdAPI = async (id: number) =>{
    try{
        const response = await instance().get('/users/detail',{
            params: {id}
        })
        return response.data

    }catch(error){
        console.log(error)
        return error
    }
}

export const deleteUserByIdAPI = async (id: number) =>{
    try{
        const response = await instance().delete('/users/detail',{
            params: {id}
        })
        return response.data

    }catch(error){
        console.log(error)
        return error
    }
}

export const loginUserAPI = async (user:IUser) =>{
    try{
        const response = await instance().post('/auth/login',user)
        //Java 에서 Messenger.message에 값을 담음
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
}

export const existsUsernameAPI = async (username: string) =>{
    try{
        const response = await instance().get('/auth/exists-username',{
            params: {username}
        })
        return response.data

    }catch(error){
        console.log(error)
        return error
    }
}
export const logoutAPI = async () =>{
    try{
        const response = await instance().get('/users/logout')
        console.log('로그아웃 결과 : '+response)
        return response.data
    }catch(error){
        console.log(error)
        return error
    }
}