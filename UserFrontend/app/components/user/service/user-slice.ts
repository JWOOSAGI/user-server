import { createSlice } from "@reduxjs/toolkit";
import { IUser } from '../model/user';
import { existsUsername, findAllUsers, findUserById, loginUser } from './user-service';
import { AddAlarm } from "@mui/icons-material";

const articleThunks = [findAllUsers]

const status = {
    pending: 'pending',
    fulfilled: 'fulfilled',
    rejected: 'rejected'
}

interface IAuth {
    message?: string
    token?: string
}

interface UserState {
    array?: Array<IUser>
    json?: IUser
    auth?: IAuth
    
}

export const initialState: UserState = {
    json: {} as IUser, //IUser json = new json 라는 뜻
    array: [],
    auth: {} as IAuth
}

export const userSlice = createSlice({
    name: "user",
    initialState,
    reducers: {}, //내부 연산
    extraReducers: builder => { //자바연동
        const { pending, rejected } = status; //진행중, 거부

        builder
            .addCase(findAllUsers.fulfilled, (state: any, { payload }: any) => { state.array = payload })
            .addCase(findUserById.fulfilled, (state: any, { payload }: any) => { state.array = payload; })
            .addCase(loginUser.fulfilled, (state: any, { payload }: any) => { state.auth = payload; })
            .addCase(existsUsername.fulfilled, (state: any, { payload }: any) => { state.auth = payload; });
    },
})
export const getAlluser = (state: any) => {
    console.log('------------------ Before useSelector ---------------')
    console.log(JSON.stringify(state.user.array))
    return state.user.array;
}

export const getUserById = (state: any) => (state.user.array)
export const getUser = (state: any) => (state.user.array)
export const getAuth = (state: any) => (state.user.auth)
export const existsUsernameMessage = (state: any) => {
    // console.log('스프링에서 넘어온 정보 : '+state.user.auth.message)
    return state.user.auth;
};

export const { } = userSlice.actions

export default userSlice.reducer;